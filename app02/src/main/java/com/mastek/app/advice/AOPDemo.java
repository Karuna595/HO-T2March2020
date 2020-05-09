package com.mastek.app.advice;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AOPDemo {
	private static final Logger LOGGER = Logger.getLogger(AOPDemo.class.getName());

	@Before("execution(* com.mastek.app.service.BankAccountService.*(..))")
	public void logBefore(JoinPoint joinPoint) {

		LOGGER.log(Level.INFO, "logBefore() is running!");
		LOGGER.log(Level.INFO, "hijacked : " + joinPoint.getSignature().getName());
		LOGGER.log(Level.INFO, "******");
	}

	@After("execution(* com.mastek.app.service.BankAccountService.*(..))")
	public void logAfter(JoinPoint joinPoint) {

		LOGGER.log(Level.INFO, "logAfter() is running!");
		LOGGER.log(Level.INFO, "hijacked : " + joinPoint.getSignature().getName());
		LOGGER.log(Level.INFO, "******");

	}

	@AfterReturning(pointcut = "execution(* com.mastek.app.service.BankAccountService.*(..)))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {

		LOGGER.log(Level.INFO, "logAfterReturning() is running!");
		LOGGER.log(Level.INFO, "hijacked : " + joinPoint.getSignature().getName());
		LOGGER.log(Level.INFO, "Method returned value is : " + result);
		LOGGER.log(Level.INFO, "******");

	}

//	@AfterThrowing(pointcut = "execution(* com.mastek.app.service.BankAccountService.*(..)))", throwing = "error")
//	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
//
//		LOGGER.log(Level.INFO, "logAfterThrowing() is running!");
//		LOGGER.log(Level.INFO, "hijacked : " + joinPoint.getSignature().getName());
//		LOGGER.log(Level.INFO, "Exception : " + error);
//		LOGGER.log(Level.INFO, "******");
//
//	}

	
//	@Around("execution(* com.mastek.app.service.BankAccountService.*(..)))")
//	   public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
//
//		LOGGER.log(Level.INFO, "logAround() is running!");
//		LOGGER.log(Level.INFO, "hijacked method : " + joinPoint.getSignature().getName());
//		LOGGER.log(Level.INFO, "hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
//			
//		LOGGER.log(Level.INFO, "Around before is running!");
//		joinPoint.proceed(); //continue on the intercepted method
//		LOGGER.log(Level.INFO, "Around after is running!");
//			
//		LOGGER.log(Level.INFO, "******");
//
//	   }
}
