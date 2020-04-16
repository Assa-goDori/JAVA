package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * PreparedStatement ����ϱ�(����)
 * 	=> 1. Statement Ŭ������ ���� �������̽�.
 *		  Statement ��ü�� db������ SQL������ ���� ���
 *	   2. �̸� SQL���� �����ϰ�, ���� ���� ?�Ķ���� ���� �����Ͽ� ����.
 */

public class jdbcEx3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		Class.forName("org.mariadb.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		String sql = "insert into temp1 values(?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		while(true) {
			System.out.println("���ڿ� ���� �Է��ϼ���(����:9999)");
			int value1 = scan.nextInt();
			if(value1==9999) {
				//ResultSetMetaData ����ϱ�
				//ResultSet : select ������ ������� ����
				//ResultSetMetaData : ������� ������ �����ϰ� �ִ� ��ü
				ResultSet rs = pstmt.executeQuery("select * from temp1");
				ResultSetMetaData rsmd = rs.getMetaData();	//������� ��������
				//rsmd.getColumnCount() : ��������� ��ȸ�� �÷��� ����
				//rsmd.getColumnName(1) : ��ȸ�� ù��° �÷��� �̸�
				for(int i =1; i<=rsmd.getColumnCount();i++) {
					System.out.print(rsmd.getColumnName(i) + "\t");
				}
				System.out.println("\n=============");
				while(rs.next()) {
					for(int i =1; i<=rsmd.getColumnCount();i++) {
						//rs.getString(rsmd.getColumnName(1)) = rs.getString("no")
//						System.out.print(rs.getString(i)); ����ó���ε� ����
						System.out.print(rs.getString(rsmd.getColumnName(i))+"\t");
					}
					System.out.println();
				}
				break;
			}
			String value2 = scan.next().trim();
			pstmt.setInt(1, value1);		// ù��° ?�� �ǹ�
			pstmt.setString(2, value2);		// �ι�° ?�� �ǹ�
			int result2 = pstmt.executeUpdate();
			System.out.println(result2 + "�� �Է¿Ϸ�");
		}
	}
}