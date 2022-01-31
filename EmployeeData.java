package jdbc;
import java.util.Scanner;
import java.sql.*;

	public class EmployeeData{
		
		static Scanner s = new Scanner(System.in);
		
		static void insert(Statement st) throws SQLException {
			
			System.out.println("Enter id,name,salary");
			int id = s.nextInt();
			String name = s.next();
			int salary = s.nextInt();
			int x = st.executeUpdate("insert into employee values("+id+",'"+name+"',"+salary+")");
			if(x != 0) {
				System.out.println("Record Inserted");
			}
		}
		static void delete(Statement st) throws SQLException{
			System.out.println("Enter the id you want to delete :");
			int id = s.nextInt();
			int x = st.executeUpdate("delete from employee where id = "+id+" ");
			if(x != 0) {
				System.out.println("Record Deleted");
			}
		}
		static void select(Statement st) throws SQLException {
			
			ResultSet rs = st.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}	
		}
		static void update(Statement st) throws SQLException {
			
			int x = st.executeUpdate("update employee set salary = salary+ "+2000+"");
			if(x != 0) {
				System.out.println("Record Updated");
			}
		}

		public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondee","root","Soumya@07");
			
			Statement st = connection.createStatement();
			
			char c=' ';
			
			while(true) {
				System.out.println("Employee database Enter your choice\n1.insert\n2.update\n3.delete\n4.select\5.exit");
				Scanner sc = new Scanner(System.in);
				c = sc.next().charAt(0);
			
				switch(c) {
				case '1' :
					insert(st);
					break;
				case '2':
					update(st);
					break;
				case '3' :
					delete(st);
					break;
				case '4':
					select(st);
					break;
				//default:
					//System.out.println("exit");
				}
				System.out.println("\nDo you want to continue? y/n");
				char c1=sc.next().charAt(0);
				
				if(c == '5') {
					break;
				}
			}
		}
	}