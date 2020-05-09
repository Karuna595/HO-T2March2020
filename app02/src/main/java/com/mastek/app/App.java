package com.mastek.app;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mastek.app.config.AppConfig;
import com.mastek.app.service.BankAccountService;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER = Logger.getLogger("confLogger");
    
    
    public static void main( String[] args )
    {
    	try {
			ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
			BankAccountService service=(BankAccountService)context.getBean(BankAccountService.class);
//			Upate below accNo
			boolean test=service.save(1999,"Ajit",2000);
			LOGGER.log(Level.INFO,"Test is "+test);
		} catch (Exception e) {
			LOGGER.log(Level.INFO,e.getMessage());
			e.printStackTrace();
		}
    }
}
