package be.intec.frituurfrida.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainDbConection {

		private static final String URL = "jdbc:mysql://localhost/dbfrituurfrida";
		private static final String USERNAME = "root";
		private static final String PASSWORD = "leaojr1103";

		protected Connection getConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance(); 
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}
		
}
