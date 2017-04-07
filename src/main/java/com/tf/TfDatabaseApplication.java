package com.tf;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TfDatabaseApplication {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException {
		
		Server server = Server.createTcpServer("-tcpAllowOthers").start();
		SpringApplication.run(TfDatabaseApplication.class, args);
	}
}
