package com.hnd;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        request.getRequestDispatcher("link.html").include(request, response);  
	          
	        String name=request.getParameter("name");  
	        String password=request.getParameter("password");  
	          
	        if(password.equals("alpha12")&& name.equals("vishnu")){  
	            out.print("You are successfully logged in!");  
	            out.print("<br>Welcome, "+name);  
	              
	            Cookie cokk=new Cookie("name",name);  
	            response.addCookie(cokk);  
	        }else{  
	            out.print("sorry, username or password error!");  
	            request.getRequestDispatcher("login.html").include(request, response);  
	        }  
	          
	        out.close();  
	    }  

}
