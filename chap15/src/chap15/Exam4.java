package chap15;

import java.io.File;

/*
 * c:\Windows ������ �����Ͽ� ������ ���� ���� ����(���丮)�� ������ ����, ������ ��ũ�� ����ϱ�
 */
public class Exam4 {
	public static void main(String[] args) {
		int dir = 0, fcnt = 0;
		long fsum = 0;
		String filename = "c:\\Windows";
		File f1 = new File(filename);
		String[] files = f1.list();	// c:\\Windows ������ ���� ���� �迭�� ����
		for(String s : files) {
			File f2 = new File(filename, s);
			if(f2.isDirectory()) {
				++dir;
			} else if(f2.isFile()) {
				++fcnt;
				fsum += f2.length();
			}
		}
		System.out.println("������ ���� : " + dir + "��");
		System.out.println("������ ���� : " + fcnt + "��");
		System.out.printf("������ �� ũ�� : %,dbyte",fsum);
	}
}