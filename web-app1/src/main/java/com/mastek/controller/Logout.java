package com.mastek.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        try(PrintWriter out=response.getWriter()){
	            //1. get session
	            HttpSession session=request.getSession();
	            //2. end your session
//	            long diff=session.getLastAccessedTime()-session.getCreationTime();
//	            if(diff>60) {
//	                session.invalidate();
//	            }
	            session.invalidate();    
	            //3. redirect to loginjsp
	            RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
	            rd.forward(request, response);
	            
	            
	        }catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	    }

	 

	    }


