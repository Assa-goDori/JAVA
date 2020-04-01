package chap15;

import java.io.IOException;
import java.io.InputStream;

/*
 * IO스트림 : 데이터의 이동 통로, 단방향(입력, 출력), 지연(버퍼가 존재)
 * 
 *     입력
 *         바이트 : InputStream => 1byte단위 읽음
 *         문자형 : Reader      => 2byte단위 읽음
 *         
 *         바이트 => 문자형 : InputStreamReader : Reader의 하위 클래스
 *     출력
 *         바이트 : OutputStream => 1byte단위 출력
 *         문자형 : Writer       => 2byte단위 출력
 *         
 *         바이트 => 문자형 : OutputStreamWriter : Writer의 하위 클래스
 *
 * 자바에서 제공되는 표준 입출력 객체
 *   표준 입력 객체 : InputStream 타입 System.in => 키보드에서 입력
 *   표준 출력 객체 : PrintStream 타입 System.out => 콘솔(화면) 출력
 *   표준 오류 객체 : PrintStream 타입 System.err => 콘솔(화면) 출력
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