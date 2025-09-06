package CaseStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectivity {
    
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mrx","root","7780");
			String query="create table coinTable(coin_id int primary key,country varchar(30), denomination int ,Year_Minting year ,current_value int,acquired_date date";
			
			Statement stmt=con.createStatement();
			
			int Result =stmt.executeUpdate(query);
			System.out.println(Result);
			
			con.close();
			stmt.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
     
	
}
