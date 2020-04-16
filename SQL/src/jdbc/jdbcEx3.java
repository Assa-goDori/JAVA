package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * PreparedStatement 사용하기(권장)
 * 	=> 1. Statement 클래스의 하위 인터페이스.
 *		  Statement 객체는 db서버에 SQL문장을 전달 기능
 *	   2. 미리 SQL문장 전달하고, 실행 전에 ?파라미터 값을 전달하여 실행.
 */

public class jdbcEx3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		Class.forName("org.mariadb.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		String sql = "insert into temp1 values(?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		while(true) {
			System.out.println("숫자와 값을 입력하세요(종료:9999)");
			int value1 = scan.nextInt();
			if(value1==9999) {
				//ResultSetMetaData 사용하기
				//ResultSet : select 구문의 결과값을 저장
				//ResultSetMetaData : 결과값의 정보를 저장하고 있는 객체
				ResultSet rs = pstmt.executeQuery("select * from temp1");
				ResultSetMetaData rsmd = rs.getMetaData();	//결과값의 정보리턴
				//rsmd.getColumnCount() : 결과값에서 조회된 컬럼의 갯수
				//rsmd.getColumnName(1) : 조회된 첫번째 컬럼의 이름
				for(int i =1; i<=rsmd.getColumnCount();i++) {
					System.out.print(rsmd.getColumnName(i) + "\t");
				}
				System.out.println("\n=============");
				while(rs.next()) {
					for(int i =1; i<=rsmd.getColumnCount();i++) {
						//rs.getString(rsmd.getColumnName(1)) = rs.getString("no")
//						System.out.print(rs.getString(i)); 숫자처리로도 가능
						System.out.print(rs.getString(rsmd.getColumnName(i))+"\t");
					}
					System.out.println();
				}
				break;
			}
			String value2 = scan.next().trim();
			pstmt.setInt(1, value1);		// 첫번째 ?를 의미
			pstmt.setString(2, value2);		// 두번째 ?를 의미
			int result2 = pstmt.executeUpdate();
			System.out.println(result2 + "개 입력완료");
		}
	}
}