package user;

import java.sql.*;

public class MySQKConn {



    public static void main(String[] args) {
    	Connection conn = null;

    	try{
    	    Class.forName("com.mysql.cj.jdbc.Driver");
    	    String url ="jdbc:mysql://127.0.0.1:3307/BBS?serverTimezone=UTC";
    	    String dbID = "root";
    	    String dbPassword = "0205083gzx";
    	    conn = DriverManager.getConnection(url, dbID, dbPassword);
    	    System.out.println("연결 성공");

    	}
    	catch(ClassNotFoundException e){
    	    System.out.println(e+"드라이버 로딩 실패");
    	}
    	catch(SQLException e){
    	    System.out.println("에러: " + e);
    	}
    	finally{
    	    try{
    	        if( conn != null && !conn.isClosed()){
    	            conn.close();
    	        }
    	    }
    	    catch( SQLException e){
    	        e.printStackTrace();
    	    }
    	}
}
}