package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * ȭ�鿡�� ���ϸ��� �Է¹޾� �ش� ������ ������ ȭ�鿡 ����ϱ�
 * �ѱ� ������ �ʵ��� �ϰ�, FileInputStream�� �̿��ϱ�.
 * �ش������� ���� ��� "�ش� ���� ����" �޼��� ���.
 */
public class Exam1 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ϸ��� �Է��ϼ���");
		String file = scan.next();
		try {
			FileInputStream fis = new FileInputStream("src/chap15/" + file + ".java");
			byte[] buf = new byte[fis.available()];
			int data = 0;
			data = fis.read(buf);
			System.out.println(new String(buf, 0, buf.length));
		} catch (FileNotFoundException e) {
			System.out.println("�ش� ���� ����");
		}
	}
}