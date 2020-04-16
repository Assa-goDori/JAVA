package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * 학생의 이름 일부만 입력받아 해당 학생들의
 * 학번, 이름, 키, 몸무게, 학년, 자기학년의 최대키, 평균키, 최대몸무게, 평균몸무게 출력하기
 */
public class Exam5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("조회하고자 하는 학생의 이름 일부를 입력하세요(종료:exit)");
				String name = scan.next();
				if (name.equals("exit")) break;

				PreparedStatement pstmt = con.prepareStatement(
						"SELECT studno, NAME, height, weight, grade, (select MAX(height) FROM student WHERE grade=s.grade)최대키, (select AVG(height) FROM student WHERE grade=s.grade)평균키, (select MAX(weight) FROM student WHERE grade=s.grade) 최대몸무게, (select AVG(weight) FROM student WHERE grade=s.grade) 평균몸무게 FROM student s WHERE NAME LIKE '%" + name + "%'");
				ResultSet rs = pstmt.executeQuery();	// rs : 화면에 출력할 레코드가 저장된 객체
				ResultSetMetaData rsmd = rs.getMetaData();

				for (int i = 1; i <= rsmd.getColumnCount(); i++)
					System.out.print(rsmd.getColumnName(i) + "\t");
				System.out.println("\n===========================");
				while (rs.next()) {
					for (int i = 1; i <= rsmd.getColumnCount(); i++) {
						System.out.print(rs.getString(i) + "\t");
					}
					System.out.println();
				}
			} catch (SQLException e) {
				System.out.println("구문오류");
			}
		}
		System.out.println("프로그램 종료");
	}
}