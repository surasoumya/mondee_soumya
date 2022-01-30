package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class jdbcDemo{

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mondee";
		String username="root";
		String password="Soumya@07";
		Connection connection=DriverManager.getConnection(url,username,password);
		if(connection!=null)
			System.out.println("connection Established");
		Statement st=connection.createStatement();
	}
}