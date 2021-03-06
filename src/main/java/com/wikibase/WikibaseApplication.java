package com.wikibase;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

//@ComponentScan({"com.wikibase","com.test"})
@SpringBootApplication
@MapperScan("com.wikibase.mapper")
public class WikibaseApplication {

	private static final Logger LOG = LoggerFactory.getLogger(WikibaseApplication.class);
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(WikibaseApplication.class);
		Environment environment = app.run(args).getEnvironment();
		LOG.info("Start Successful!");
		LOG.info("Address: \thttp://127.0.0.1:{}",environment.getProperty("server.port"));
	}

}
