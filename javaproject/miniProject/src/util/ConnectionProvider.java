package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

			
		public static Connection getConnection() throws SQLException {

			String Url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			Connection conn = null;
			

						
						
			conn = DriverManager.getConnection(Url, "ONE", "one1234");

			return conn;
		

		}


	}

