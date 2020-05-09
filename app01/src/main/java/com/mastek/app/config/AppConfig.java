package com.mastek.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan(basePackages= {
		"com.mastek.app", "com.mastek.app.advice", "com.mastek.app.service"
})
public class AppConfig {

}
