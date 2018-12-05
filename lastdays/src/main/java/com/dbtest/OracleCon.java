package com.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleCon {

	public static void main(String[] args) {
		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// step2 create the connection object
			//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.214.144:1558:dev1201", "DVIEWI1", "DVIEWI1");
			//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//ows-drac-scan.oami.eu.int:1521:cf.drac.tmdn.org", "dviewi1", "6VI3md!");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//tdn-drac-scan.test.oami.eu:1521:tdn.drac.tmdn.org", "cestod2", "C3st0D2");

			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			ResultSet rs = stmt.executeQuery("select * from DWEBSERVICE where idoffice=41 and idapplication=1");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

			// step5 close the connection object
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
