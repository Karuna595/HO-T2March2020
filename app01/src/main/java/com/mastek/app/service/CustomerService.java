package com.mastek.app.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;
@Component
public class CustomerService implements ICustomerService {

	private static final Logger LOGGER = Logger.getLogger(CustomerService.class.getName());
	private String name;
	private String url;
	
	public CustomerService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String printName() {
		LOGGER.log(Level.INFO,"Printing name "+getName());
		return this.getName();
	}

	@Override
	public String printUrl() {
		LOGGER.log(Level.INFO,"Printing url "+getUrl());
		return this.getUrl();
	}

	@Override
	public void printException() {
		LOGGER.log(Level.SEVERE,"Printing exception ");
		throw new IllegalArgumentException("Custom exception");
		
	}

}
