package s08;


import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s08/checkerAjax") 
public class CheckerAjax extends HttpServlet { 
	/*
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user"); 
        Set<Character> set = new TreeSet<>(); 
        if (user != null) {
            for (char c : user.toCharArray()) {
                set.add(Character.toLowerCase(c));
            }
        }
        request.setAttribute("set", set);
        request.setContentType("text/plain");
        request.setCharacterEncoding("utf-8");
       
        try (PrintWriter writer = response.getWriter()) {
        	for (char c : set) {
        	writer.println(c);}
       
        }      
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    */
}





