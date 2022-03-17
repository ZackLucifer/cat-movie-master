package com.ctgu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ctgu.mapper")
@SpringBootApplication
public class CatMoiveServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatMoiveServerApplication.class, args);
	}

}
