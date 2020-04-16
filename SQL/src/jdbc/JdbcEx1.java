package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * jdbc
 * 1. java.sql ��Ű���� Ŭ����(�������̽�)��.
 * 2. mariadb ����̹� �����ϱ� => driver�� path�� �����ϱ�
 * 	  driver �ٿ�ޱ� : mariadb.org
 * 3. ���� ��ü ���� : Connection ��ü(�������̽�)
 * 4. Statement ��ü ����
 * 		int 	  executeUpdate(sql����) : insert, update, delete, create, drop, alter...
 * 		ResultSet executeQuery(sql����) : select ����
 * 5. ��� ó��
 */
public class JdbcEx1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//����̹� Ŭ���� �޸� �ε�
		Class.forName("org.mariadb.jdbc.Driver");
		//url : jdbc:mariadb://localhost:3306/classdb
		//DB username : scott
		//DB password : 1234
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		System.out.println("Connection ��ü ���� �Ϸ�");
		//Statement ��ü ���� : sql ��� ���� ��ü
		Statement stmt = con.createStatement();
		//ResultSet : select ������ ����� �����ϰ� �ִ� ��ü
		ResultSet rs = stmt.executeQuery("select * from student order by studno");
		while(rs.next()) {
			System.out.print("�й� : " + rs.getString("studno"));
			System.out.print(", �̸� : " + rs.getString("name"));
			System.out.print(", �г� : " + rs.getInt("grade"));
			System.out.println(", �����а�1 : " + rs.getString("major1"));
		}
	}
}