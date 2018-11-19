package com.oliver.database;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.oliver.database.service","com.oliver.database.controller"})
@MapperScan(value = "com.oliver.database.mapper")
public class DatabaseApplication {
	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}
}
