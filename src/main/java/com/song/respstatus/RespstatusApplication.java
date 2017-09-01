package com.song.respstatus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.song.respstatus.dao")
public class RespstatusApplication {

	public static void main(String[] args) {
		SpringApplication.run(RespstatusApplication.class, args);
	}
}
