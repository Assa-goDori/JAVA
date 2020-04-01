package chap15;
import java.util.*;
import java.io.*;
/*
 * ȭ�鿡�� ���ϸ��� �Է¹ް�,
 * ȭ�鿡 ������ �Է¹޾Ƽ�, �Է¹��� ���ϸ� ������ �����ϱ�
 * "exit" ������ �Է¹����� �Է�����.
 * FileOutputStream ����ϱ�
 * [���]
 * aaa.txt
 * ������ ������ �Է��ϼ���
 * �ȳ��ϼ���
 * �ݰ����ϴ�.
 * exit
 * 
 *  aaa.txt ������ ����
 *  �ȳ��ϼ���
 *  �ݰ����ϴ�.
 */
public class Exam2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ϸ��� �Է��ϼ���");
		String name = scan.next();
		FileOutputStream fos = new FileOutputStream(name, true);
		System.out.println("������ ������ �Է��ϼ���");
		while(true) {
			String note = scan.nextLine();
			if(note.equals("exit")) break;
			fos.write((note+"\n").getBytes());
		}
		fos.write(("----------" + new Date() + "---------").getBytes());
		fos.flush();
		fos.close();
		scan.close();
	}
}