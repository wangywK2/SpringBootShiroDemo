package com.example.shirodemo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.example.shirodemo.dao")
public class ShirodemoApplication {
	public static Logger logger = LoggerFactory.getLogger(ShirodemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ShirodemoApplication.class, args);
		logger.info("******************************************");
		logger.info("******************应用启动****************");
		logger.info("******************************************");
	}
}
