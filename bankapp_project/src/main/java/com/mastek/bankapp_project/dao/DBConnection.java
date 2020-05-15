package com.mastek.bankapp_project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	// For Oracle "jdbc:oracle:@localhost:1521:bankdb";
		// For MySQL "jdbc:mysql://localhost:3352/bankdb";

		public static final String URL = "jdbc:postgresql://localhost:5432/bankdb";
		public static final String USER = "postgres";
		public static final String PASSWORD = "root";
		public static final String DRIVER_NAME = "org.postgresql.Driver";

		public static Connection getConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
			
			final Class driver = Class.forName(DRIVER_NAME);
//			DriverManager.registerDriver((Driver)driver.newInstance());
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			if (connection.isClosed()) {
				return null;
			}
			return connection;

		}
}
