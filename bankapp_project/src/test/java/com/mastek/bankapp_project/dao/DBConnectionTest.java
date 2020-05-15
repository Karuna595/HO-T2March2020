package com.mastek.bankapp_project.dao;


	import static org.junit.jupiter.api.Assertions.assertNotNull;
	import static org.junit.jupiter.api.Assertions.assertNull;

	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.HashSet;
	import java.util.Set;

	import org.junit.jupiter.api.Disabled;
	import org.junit.jupiter.api.Test;

	import com.mastek.bankapp_project.dao.DBConnection;

	class DBConnectionTest {

		private Connection connection;
		//Expected to fail
		@Disabled
		@Test
		void testGetConnectionNull() {
			try {
				assertNull(DBConnection.getConnection(),"Expected null Value");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//Below test must always successfull
		@Test
		void testGetConnection() {
			try {
				assertNotNull(DBConnection.getConnection(),"Expected null Value");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
