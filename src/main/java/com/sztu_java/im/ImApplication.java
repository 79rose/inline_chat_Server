package com.sztu_java.im;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ImApplication.class, args);
	}
   
	//    加入netty
	@Autowired
  	private com.sztu_java.im.netty.CoordinationNettyServer nettyServer;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'run'");
		nettyServer.start();
	}

}
