package chap15;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 키보드로부터 문자형 스트림으로 읽기
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