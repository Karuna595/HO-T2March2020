package com.mastek.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstNameServlet
 */
@WebServlet("/S1")
public class FirstNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        HttpSession session=request.getSession();
	        try{
	            String fname=request.getParameter("fname").trim();
	            //send data to next page
	            request.setAttribute("fname", fname);
	            session.setAttribute("fname", fname);
	            
	            RequestDispatcher rd=request.getRequestDispatcher("Page2.jsp");
	            //if you want request to forward use forward
	            //if you want response to be part of dispatching -> rd.include();
	            rd.forward(request, response);
	            
	        }catch (Exception e) {
	            log("Exception "+e.getMessage());
	        }
	    }

	 

	}