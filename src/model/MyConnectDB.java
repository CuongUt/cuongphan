package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class MyConnectDB {




		public static Connection getConnection() { 
			Connection connection = null;  
			String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
			String url = "jdbc:sqlserver://localhost:1433;databaseName=hihi"; 
			String user ="sa";  
			String pass="aknkcgmtmtp";
			
			try {   Class.forName(driver); 
			connection = DriverManager.getConnection(url,user,pass);  
			} catch (Exception e) {   
				// Orther err   
				e.printStackTrace();  
				} 
			 
			  return connection; 
			  
			} 
		public static void main(String[]  args){ 
			Connection connection = MyConnectDB. getConnection() ;
			if (connection != null ) { 
				System.out.println("Kết nối thành công");
				}else {
					
					System.out.println("Kết nối thất bại"); 
					} 
		}
		public void thucThiCauLenhSql(String sql) throws Exception{
			Connection connect=getConnection();
			Statement stmt = connect.createStatement();
			stmt.executeUpdate(sql);
			
		}

		public ResultSet selectData(String sql) throws Exception {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			return rs;
		}





}
