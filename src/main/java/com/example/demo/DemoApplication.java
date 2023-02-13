////package com.example.demo;
////
////import org.springframework.boot.SpringApplication;
////import org.springframework.boot.autoconfigure.SpringBootApplication;
////
////import java.sql.Connection;
////import java.sql.DriverManager;
////import java.sql.SQLException;
////
////@SpringBootApplication
////public class DemoApplication {
////
////	public DemoApplication() throws SQLException {
////	}
////
//////	public static void main(String[] args) {
//////		SpringApplication.run(DemoApplication.class, args);
//////	}
//////	String URL = "jdbc:oracle:thin:@192.168.121.100:1521:lcdev";
//////	String USER = "train";
//////	String PASS = "train";
//////	Connection conn = DriverManager.getConnection(URL, USER, PASS);
////
//
//}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
