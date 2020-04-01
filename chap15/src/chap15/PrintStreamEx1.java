package chap15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * ������Ʈ�� : PrintStream
 *   1. OutputStream�� ���� Ŭ����. byte�� ��� ��Ʈ��
 *   2. write() ����� �پ��ϰ� Ȯ���� print(), println(), printf() �޼���
 *      - ��� �ڷ��� ��� ����
 *      - write()�� IOException ����ó���� �ؾ������� PrintStream�� ����ó���� ���� �ʾƵ� �ȴ�.
 *   3. System.out(ǥ�� ���), System.error(ǥ�� ����)�� Ŭ������
 */
public class PrintStreamEx1 {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("ȫ�浿");
		ps.println(1234);
		ps.println(true);
		ps.println(65);
		ps.write(65);	//A�Էµ�, askii ������ �ν�
		ps.flush();
		ps = new PrintStream("print2.txt");	//�����ڸ� �پ��ϰ� ��밡��
		ps.println("ȫ�浿");
		ps.println(1234);
		ps.println(true);
		ps.println(65);
		ps.write(65);
		ps.flush();
		ps.close();
	}
}