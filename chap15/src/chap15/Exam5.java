package chap15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * bin/chap15/PrintStreamEx1.class ������ ���� �����̴�.
 * ���� ������ �о ȭ�鿡 16������ ����ϱ�
 */
public class Exam5 {
	public static void main(String[] args) throws IOException {
		String filePath = "bin/chap15/PrintStreamEx1.class";
		File f = new File(filePath);
		FileInputStream fr = new FileInputStream(f);
		byte[] buf = new byte[16];
		int data = 0;
		while((data = fr.read(buf)) != -1) {
			for(int i = 0; i<data;i++) {
				System.out.printf("%02X ", buf[i]);
			}
			System.out.println();
		}
	} 
}