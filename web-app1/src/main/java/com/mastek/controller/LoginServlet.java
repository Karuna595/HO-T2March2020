package com.mastek.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	 

	    /**
	     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	     */
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        try(PrintWriter out=response.getWriter()){
	            HttpSession session=request.getSession(true);
	            String username=request.getParameter("username").trim();
	            String password=request.getParameter("password").trim();
	            response.setContentType("text/html");
//	            out.println("Welcome "+username);
	            RequestDispatcher rd=null;
	            if(username.equals("dhanashree")&&password.equals("dhanashree")) {
	                rd=request.getRequestDispatcher("index.jsp");
//	                rd.include(request, response);
	            }else {
//	                out.println("Invalid credentials ");
	                request.setAttribute("error", "Invalid Credentials! Please try it again!");
	                rd=request.getRequestDispatcher("Login.jsp");
//	                rd.forward(request, response);
	            }
	            rd.forward(request, response);
	            
	        }catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	 

	}
	 

	


