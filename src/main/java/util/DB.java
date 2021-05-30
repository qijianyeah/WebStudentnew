
  package util;

  import java.sql.*;
  /**
   * 
   * @author Administrator
   * 连接和关闭数据库
   */
  public class DB {
	  public static  final String Driver = "com.mysql.jdbc.Driver";
	  public static final String URL = "jdbc:mysql://localhost:3306/llc?useSSL=false&amp;useUnicode=true&amp;characterEncoding=UTF-8&amp;autoReconnect=true&amp;failOverReadOnly=false";
	  public static final String USER = "root";
	  public static final String PASSWORD = "root";
	public static Connection getConn() {

		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/llc?user=root&password=root");
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConn(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeStmt(Statement stmt) {
		try {
			if(stmt != null) {
				stmt.close();
				stmt = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeRs(ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
				rs = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
   }
