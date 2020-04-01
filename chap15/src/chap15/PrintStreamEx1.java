package chap15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 보조스트림 : PrintStream
 *   1. OutputStream의 하위 클래스. byte형 출력 스트림
 *   2. write() 기능을 다양하게 확장한 print(), println(), printf() 메서드
 *      - 모든 자료형 출력 가능
 *      - write()는 IOException 예외처리를 해야하지만 PrintStream는 예외처리를 하지 않아도 된다.
 *   3. System.out(표준 출력), System.error(표준 오류)의 클래스형
 */
public class PrintStreamEx1 {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);
		ps.println(65);
		ps.write(65);	//A입력됨, askii 값으로 인식
		ps.flush();
		ps = new PrintStream("print2.txt");	//생성자를 다양하게 사용가능
		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);
		ps.println(65);
		ps.write(65);
		ps.flush();
		ps.close();
	}
}