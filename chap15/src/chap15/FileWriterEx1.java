package chap15;

import java.io.FileWriter;
import java.io.IOException;
/*
 * FileWriter ���� : ������ �ؽ�Ʈ ������ ���.
 *                 ������ �������� ������ ���� ����.
 *                 ������ �����ϸ� ���Ͽ� ����.
 *     void write(int data) : 1char(2byte) ���
 *     void write(char[] buf) : buf�� ������ ���Ͽ� ���
 *     void write(char[] buf, start, len) : buf�� start�ε��������� ������ len�� ũ�⸸ŭ ���Ͽ� ���
 *     void write(String data) : ���ڿ� ���.
 */
public class FileWriterEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("output2.txt ���Ͽ� ��µ˴ϴ�");
		//fos : out.txt ������ ���� ���� ������.
		FileWriter fos = new FileWriter("output.txt");
		fos.write('1'); fos.write('2'); fos.write('3');
		fos.write('c'); fos.write('b'); fos.write('c');
		fos.write('��'); fos.write('��'); fos.write('��');
		char[] buf = "\n�ݰ����ϴ�. FileOutputStream ���� �Դϴ�.\n".toCharArray();
		fos.write(buf);
		fos.write(buf,1,6);
		fos.write("�ȳ��ϼ���. ȫ�浿 �Դϴ�.");
		fos.flush();
		fos.close();
	}
}