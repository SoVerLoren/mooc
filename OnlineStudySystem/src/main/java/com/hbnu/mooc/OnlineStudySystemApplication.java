package com.hbnu.mooc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.hbnu.mooc,org.n3r.idworker")
@MapperScan(basePackages="com.hbnu.mooc.dao")
@SpringBootApplication
public class OnlineStudySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineStudySystemApplication.class, args);
	}
}
