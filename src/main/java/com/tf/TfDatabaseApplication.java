package com.tf;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TfDatabaseApplication {

	public static void main(String[] args) throws SQLException {
		
		Server.createTcpServer("-tcpAllowOthers").start();
		SpringApplication.run(TfDatabaseApplication.class, args);
	}
	
}
