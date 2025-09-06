//package CaseStudy;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.time.LocalDate;
//
//public class coinOperation {
//	
//	int id;
//	String tcountry;
//	int tdenomination;
//	int tyom;
//	double tcurValue;
//	LocalDate taqdt;
//  
//	public void addDatabase() {
//		Connection con = DBUtility.getSQLConnection();
//		Statement stmt = con.createStatement();
//		String query = "select * from coin";
//		ResultSet rs=stmt.executeQuery(query);
//		while(rs.next())
//		{
//			tcid=rs.getInt(1);
//			tcountry=rs.getString(2);
//			tdenomination
//		}
//	}
//	
//	public void DBConnection() {
//		
//	}
//}
