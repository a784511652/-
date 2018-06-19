package com.imooc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.imooc.dataobject.mapper")
public class McSpringbootDinnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(McSpringbootDinnerApplication.class, args);
	}
}
