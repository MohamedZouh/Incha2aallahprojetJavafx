package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler extends Configs {
	Connection dbconnection;
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String connectionString ="jdbc:mysql://"+Configs.dbhost+":"+Configs.dbport+"/"+Configs.dbname+"?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		dbconnection=DriverManager.getConnection(connectionString, Configs.dbuser, Configs.dbpass);
		return dbconnection;
		
	}

}
