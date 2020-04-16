package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("sql 구문을 입력하세요(종료:exit)");
				String sql = scan.nextLine();
				if (sql.equals("exit")) break;

				PreparedStatement pstmt2 = con.prepareStatement("select count(*) from (" + sql + ") a");
				ResultSet rs2 = pstmt2.executeQuery();
				rs2.next();		// 레코드 선택.(사용안하면 getString() 사용불가)
				int rows = rs2.getInt(1);	//rs.getInt(1) : 컬럼의값을 정수형으로 리턴
				System.out.println("조회 레코드 수 : " + rows);

				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();	// rs : 화면에 출력할 레코드가 저장된 객체
				ResultSetMetaData rsmd = rs.getMetaData();
				System.out.println("조회 컬럼 수 : " + rsmd.getColumnCount());

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