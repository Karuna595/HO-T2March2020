package com.mastek.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet(urlPatterns={"/GreetingServlet","/getGreet","/postGreet"},
initParams = @WebInitParam(name = "servlet_name", value ="GreetingServlet" ),

loadOnStartup = 1)
public class GreetingServlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;

	 

	    @Override
	    public void init() throws ServletException {
	        super.init();
	        System.out.println("LifeCycle : init()");

	 

	    }
	    
	    @Override
	    public void init(ServletConfig config) throws ServletException {
	        super.init(config);
	        System.out.println("LifeCycle : init(Servletconfig)");

	 

	    }

	 

	    // overriding
	    @Override
	    protected void service(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        System.out.println("LifeCycle : Service(HSReq,HSResp)");
	        switch (request.getMethod().toLowerCase()) {
	        case "get":
	            doGet(request, response);
	            break;

	 

	        case "post":
	            doPost(request, response);
	            break;
	        }
	    }

	 

	    /**
	     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	     *      response)
	     */
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        System.out.println("LifeCycle : doGet(HSReq,HSResp)");
	        
	        ServletConfig servletConfig=getServletConfig();
	        String initparam_value=servletConfig.getInitParameter("servlet_name");
	        
	            
	        response.getWriter().write("<h1>"+initparam_value+"</h1>");
	        response.getWriter().write("Do Get Called");
	    }

	 

	    /**
	     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	     *      response)
	     */
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        System.out.println("LifeCycle : doPost(HSReq,HSResp)");
	        String userName = request.getParameter("userName").trim();
	        response.getWriter().write("Do Post Called by " + userName);
	    }

	 

	    @Override
	    public void destroy() {
	        super.destroy();
	        System.out.println("LifeCycle : destroy()");

	 

	    }
	}