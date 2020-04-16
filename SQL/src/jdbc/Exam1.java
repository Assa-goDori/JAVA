package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 교수테이블에서 교수번호, 이름, 학과코드, 급여, 보너스 출력하기
 */
public class Exam1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select no, name, deptno, salary, bonus from professor");
		while(rs.next()) {
			System.out.print("교수번호 : " + rs.getInt(1));
			System.out.print(", 이름 : " + rs.getString(2));
			System.out.print(", 학과코드 : " + rs.getInt(3));
			System.out.print(", 급여 : " + rs.getInt(4));
			System.out.println(", 보너스 : " + rs.getInt(5));
		}
	}
}