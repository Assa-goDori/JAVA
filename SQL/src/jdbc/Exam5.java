package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * �л��� �̸� �Ϻθ� �Է¹޾� �ش� �л�����
 * �й�, �̸�, Ű, ������, �г�, �ڱ��г��� �ִ�Ű, ���Ű, �ִ������, ��ո����� ����ϱ�
 */
public class Exam5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("��ȸ�ϰ��� �ϴ� �л��� �̸� �Ϻθ� �Է��ϼ���(����:exit)");
				String name = scan.next();
				if (name.equals("exit")) break;

				PreparedStatement pstmt = con.prepareStatement(
						"SELECT studno, NAME, height, weight, grade, (select MAX(height) FROM student WHERE grade=s.grade)�ִ�Ű, (select AVG(height) FROM student WHERE grade=s.grade)���Ű, (select MAX(weight) FROM student WHERE grade=s.grade) �ִ������, (select AVG(weight) FROM student WHERE grade=s.grade) ��ո����� FROM student s WHERE NAME LIKE '%" + name + "%'");
				ResultSet rs = pstmt.executeQuery();	// rs : ȭ�鿡 ����� ���ڵ尡 ����� ��ü
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
				System.out.println("��������");
			}
		}
		System.out.println("���α׷� ����");
	}
}