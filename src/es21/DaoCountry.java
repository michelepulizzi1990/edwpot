package es21;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import javax.sql.DataSource;





public class DaoCountry {

    private Connection conn;



    public DaoCountry(DataSource ds) {

        try {

            this.conn = ds.getConnection();

        } catch (SQLException se) {

            throw new IllegalStateException("Database issue " + se.getMessage());

        }

    }



    public List<Country> getCountriesForRegion(String regionId) {

        List<Country> results = new ArrayList<>();



        try {

 //           Statement stmt = conn.createStatement();

   //         ResultSet rs = stmt.executeQuery("select country_id, country_name from regions natural join countries where region_id=1");

        	PreparedStatement query = null;
        	String s = "select country_id, country_name from regions natural join countries where region_id= ?";
        	query = conn.prepareStatement(s);
        	query.setLong(1, Long.parseLong(regionId));
        	ResultSet rs = query.executeQuery();

            while (rs.next()) {

                results.add(new Country(rs.getString("COUNTRY_ID"), rs.getString("COUNTRY_NAME")));

            }

        } catch (SQLException se) {

            throw new IllegalStateException("Database issue " + se.getMessage());

        }



        return results;

    }

}
