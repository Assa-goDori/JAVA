package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * jdbc
 * 1. java.sql 패키지의 클래스(인터페이스)들.
 * 2. mariadb 드라이버 선택하기 => driver를 path에 설정하기
 * 	  driver 다운받기 : mariadb.org
 * 3. 연결 객체 생성 : Connection 객체(인터페이스)
 * 4. Statement 객체 생성
 * 		int 	  executeUpdate(sql문장) : insert, update, delete, create, drop, alter...
 * 		ResultSet executeQuery(sql문장) : select 구문
 * 5. 결과 처리
 */
public class JdbcEx1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//드라이버 클래스 메모리 로드
		Class.forName("org.mariadb.jdbc.Driver");
		//url : jdbc:mariadb://localhost:3306/classdb
		//DB username : scott
		//DB password : 1234
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		System.out.println("Connection 객체 생성 완료");
		//Statement 객체 생성 : sql 명령 전달 객체
		Statement stmt = con.createStatement();
		//ResultSet : select 구문의 결과를 저장하고 있는 객체
		ResultSet rs = stmt.executeQuery("select * from student order by studno");
		while(rs.next()) {
			System.out.print("학번 : " + rs.getString("studno"));
			System.out.print(", 이름 : " + rs.getString("name"));
			System.out.print(", 학년 : " + rs.getInt("grade"));
			System.out.println(", 전공학과1 : " + rs.getString("major1"));
		}
	}
}