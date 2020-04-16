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
				System.out.println("sql ������ �Է��ϼ���(����:exit)");
				String sql = scan.nextLine();
				if (sql.equals("exit")) break;

				PreparedStatement pstmt2 = con.prepareStatement("select count(*) from (" + sql + ") a");
				ResultSet rs2 = pstmt2.executeQuery();
				rs2.next();		// ���ڵ� ����.(�����ϸ� getString() ���Ұ�)
				int rows = rs2.getInt(1);	//rs.getInt(1) : �÷��ǰ��� ���������� ����
				System.out.println("��ȸ ���ڵ� �� : " + rows);

				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();	// rs : ȭ�鿡 ����� ���ڵ尡 ����� ��ü
				ResultSetMetaData rsmd = rs.getMetaData();
				System.out.println("��ȸ �÷� �� : " + rsmd.getColumnCount());

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