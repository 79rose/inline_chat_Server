package com.sztu_java.im;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.sztu_java.im.dao"})
public class ImApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ImApplication.class, args);
	}
   
	//    加入netty
	@Autowired
  	private com.sztu_java.im.netty.CoordinationNettyServer nettyServer;

	@Override
	public void run(String... args) throws Exception {
		nettyServer.start();
	}

}
