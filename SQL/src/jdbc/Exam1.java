package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * �������̺��� ������ȣ, �̸�, �а��ڵ�, �޿�, ���ʽ� ����ϱ�
 */
public class Exam1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select no, name, deptno, salary, bonus from professor");
		while(rs.next()) {
			System.out.print("������ȣ : " + rs.getInt(1));
			System.out.print(", �̸� : " + rs.getString(2));
			System.out.print(", �а��ڵ� : " + rs.getInt(3));
			System.out.print(", �޿� : " + rs.getInt(4));
			System.out.println(", ���ʽ� : " + rs.getInt(5));
		}
	}
}