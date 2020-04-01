package chap15;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1");
		//f1.mkdir() : ���� ����. ���� true / �̹� �ִ� ��� false
		System.out.printf("%s ���� ���� : %b%n", f1.getAbsolutePath(),f1.mkdir());
		File f2 = new File("c:/temp1/test.txt");
		//f2.createNewFile() : ���� ����. ���� true / �̹� �ִ� ��� false
		System.out.printf("%s ���ϻ��� : %b%n", f2.getAbsolutePath(),f2.createNewFile());
		//f2.getName() : ������ �̸�.
		//f2.length() : ������ ũ��.
		System.out.printf("�����̸� : %s, ����ũ�� : %,d byte%n", f2.getName(), f2.length());
		File f3 = new File("c:/temp1/test2.txt");
		//f2.renameTo(f3) : ���� �̸� ����. test.txt -> test2.txt
		System.out.printf("%s->%s �̸����� : %b%n", f2.getName(), f3.getName(), f2.renameTo(f3));
		//f3.lastModified() : ���� ���� �ð�. 1970�� ���� ���� ���ϼ��� �Ͻñ��� �и��� ����. -> renameTo �޼��� ���� �ð�
		System.out.printf("%s ���� ���� �����ð� : %s%n", f3.getName(), new Date(f3.lastModified()));
		//f3.delete() : ���� ����.
		System.out.printf("%s ���� ���� : %b%n", f3.getName(), f3.delete());
		//���� ���� �Է��� ��Ʈ���� �̿��Ͽ��� ��.
	}
}