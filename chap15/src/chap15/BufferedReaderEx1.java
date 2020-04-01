package chap15;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ������Ʈ��
 *    1. ���ο� ����� �߰��� ��Ʈ��
 *    2. ��ü ������ �ٸ� ��Ʈ���� �Ű������� �޴´�.   ex) new PrintStream(fos) new InputStream(System.in)
 *       new BufferedReader(Reader)
 *       new BufferedInputStream(InputStream)
 * BufferedReader : ������ ����� �߰��Ͽ� ������ ��� ��Ŵ.
 *     => readLine() : ���͸� �������� �� �پ� ���� �� ����
 * 
 * Ű���忡�� �Է��� ������ �� �پ� �о ����ϰ� buffered.txt ���Ͽ� �����ϱ�
 * Scanner.nextLine() : Ű���� & ���Ϸ� ���� �Է¹��� ������ �� �پ� �б� => ������� �ʰ� Stream���θ� �о �� �ִ�.
 */
public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//System.in : InputStream, �����
		FileWriter fw = new FileWriter("buffered.txt");	//buffered.txt : ������
		String data = null;	//data : ������κ��� �Էµ� ����
		while((data = br.readLine()) != null) {	//ctrl + z = EOF(-1), ������ ��
			System.out.println(data);
			fw.write(data + "\n");
		}
		fw.flush();
		fw.close();
	}
}