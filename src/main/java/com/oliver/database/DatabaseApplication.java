package com.oliver.database;

import com.oliver.database.service.impl.DataGenerator;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.oliver.database.service","com.oliver.database.controller"})
@MapperScan(value = "com.oliver.database.mapper")
public class DatabaseApplication {
	public static void main(String[] args) {
		//SpringApplication.run(DatabaseApplication.class, args);
		try (ConfigurableApplicationContext applicationContext = SpringApplication.run(DatabaseApplication.class, args)) {
			applicationContext.getBean(DataGenerator.class).generateData(10);
		}
	}
}
