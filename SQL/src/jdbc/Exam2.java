package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 미리 temp1 테이블 생성하기.
 * 화면에서 숫자와 문자를 입력받아서 temp1테이블에 추가하기.(종료:no -> 9999)
 * 종료시 temp1 테이블의 내용을 화면에 출력하기
 */
public class Exam2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		Class.forName("org.mariadb.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		Statement stmt = con.createStatement();
		while(true) {
			System.out.println("숫자와 값을 입력하세요(종료:9999)");
			int value1 = scan.nextInt();
			if(value1==9999) {
				ResultSet rs = stmt.executeQuery("select * from temp1");
				while(rs.next()) {
					System.out.print("no : " + rs.getInt(1));
					System.out.println(", text : " + rs.getString(2));
				}
				break;
			}
			String value2 = scan.next().trim();
			String sql = "insert into temp1 values(" + value1 + ",'" + value2 + "')";
			int result2 = stmt.executeUpdate(sql);
			System.out.println(result2 + "개 입력완료");
		}
	}
}