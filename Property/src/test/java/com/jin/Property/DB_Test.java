package com.jin.Property;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class DB_Test {

	@Test
	public void test() throws Exception {
	    Class.forName("org.mariadb.jdbc.Driver"); // ������DB
	    // Class.forName("com.mysql.jdbc.Driver"); MySQL

	    Connection con = DriverManager.getConnection("jdbc:mariadb://property-db.cqhu9tmvskch.ap-northeast-2.rds.amazonaws.com:3306/", "kic12",     "kic12345");// ������DB
	    // Connection con =     DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","passwd"); MySQL
	    System.out.println(con);
	    }
	
}
