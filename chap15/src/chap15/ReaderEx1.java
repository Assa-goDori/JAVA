package chap15;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Ű����κ��� ������ ��Ʈ������ �б�
 */
import java.io.Reader;
public class ReaderEx1 {
	public static void main(String[] args) throws IOException {
		Reader in = new InputStreamReader(System.in);
		int data;
		while((data=in.read()) !=-1) {
			System.out.print((char)data);
		}
	}
}