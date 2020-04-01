package chap15;

import java.io.IOException;
import java.io.InputStream;

/*
 * IO��Ʈ�� : �������� �̵� ���, �ܹ���(�Է�, ���), ����(���۰� ����)
 * 
 *     �Է�
 *         ����Ʈ : InputStream => 1byte���� ����
 *         ������ : Reader      => 2byte���� ����
 *         
 *         ����Ʈ => ������ : InputStreamReader : Reader�� ���� Ŭ����
 *     ���
 *         ����Ʈ : OutputStream => 1byte���� ���
 *         ������ : Writer       => 2byte���� ���
 *         
 *         ����Ʈ => ������ : OutputStreamWriter : Writer�� ���� Ŭ����
 *
 * �ڹٿ��� �����Ǵ� ǥ�� ����� ��ü
 *   ǥ�� �Է� ��ü : InputStream Ÿ�� System.in => Ű���忡�� �Է�
 *   ǥ�� ��� ��ü : PrintStream Ÿ�� System.out => �ܼ�(ȭ��) ���
 *   ǥ�� ���� ��ü : PrintStream Ÿ�� System.err => �ܼ�(ȭ��) ���
 */
public class InputStreamEx1 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		int data = 0;
		while((data=in.read()) != -1) {
			System.out.print((char)data);
		}
	}
}