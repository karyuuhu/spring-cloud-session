package com.ssga.hjl;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.ssga.hjl")
public class Main extends SpringBootServletInitializer{
	public static void main(String[] args) {
		new SpringApplicationBuilder(Main.class).web(WebApplicationType.SERVLET).run(args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Main.class);
	}
}
