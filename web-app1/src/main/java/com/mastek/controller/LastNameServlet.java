package com.mastek.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LastNameServlet
 */
@WebServlet("/S2")
public class LastNameServlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;

	 

	    /**
	     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	     */
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        HttpSession session=request.getSession();
	        try(PrintWriter writer=response.getWriter()) {
	            String lname=request.getParameter("lname").trim();
//	            String fname=(String) request.getAttribute("fname");
	            String fname=(String) session.getAttribute("fname");
	            writer.write("<h1> First Name </h1>");
	            writer.write("<h1> "+fname+"</h1>");
	            writer.write("<h1> Last Name </h1>");
	            writer.write("<h1> "+lname+"</h1>");
	            
	        } catch (Exception e) {
	            log("Exception "+e.getMessage());
	        }
	    }

	 

	}

