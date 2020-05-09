package com.mastek.app;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mastek.app.config.AppConfig;
import com.mastek.app.service.CustomerService;

/**
 * Hello world!
 *
 */
public class App {
	
    private static final Logger LOGGER = Logger.getLogger("confLogger");
    
    
	public static void main(String[] args) {
		try {
			ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
			CustomerService service=(CustomerService)context.getBean(CustomerService.class);
			service.setName("CustomService");
			service.setUrl("/CustomService");
			service.printName();
			service.printUrl();
			service.printException();
		
		} catch (Exception e) {
			LOGGER.log(Level.INFO,e.getMessage());
		}
	}
}
