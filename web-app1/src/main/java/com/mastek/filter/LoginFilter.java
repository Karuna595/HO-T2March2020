package com.mastek.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class LiginFilter
 */
public class LoginFilter implements Filter {

	   private FilterConfig config;

	   

	    /**
	     * @see Filter#init(FilterConfig)
	     */
	    public void init(FilterConfig fConfig) throws ServletException {
	        System.out.println("init Filter Called");
	        this.config = fConfig;
	    }

	 

	    /**
	     * @see Filter#destroy()
	     */
	    public void destroy() {
	        System.out.println("destroy Filter Called");
	        this.config = null;
	    }

	 

	    /**
	     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	     */
	    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	            throws IOException, ServletException {
	        try {
	            System.out.println("doFilter Called");
	            String username = request.getParameter("username").trim();
	            String password = request.getParameter("password").trim();

	 

	            if (username.equals("dhanashree") && password.equals("dhanashree")) {
	                chain.doFilter(request, response);
	            } else {
	                request.setAttribute("error", "Invalid Credentials");
	                RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
	                rd.forward(request, response);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	 

	    }

	 

	}

