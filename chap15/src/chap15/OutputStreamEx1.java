package chap15;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("출력 스트림 예제");
		OutputStream out = System.out;
		out.write('1'); out.write('2'); out.write('3');
		out.write('a'); out.write('b'); out.write('c');
		out.write('가'); out.write('나'); out.write('다');
//		out.flush();	// 강제로 출력버퍼의 내용을 목적지(콘솔)로 출력.
		
		System.out.println();
		//Writer 객체로 변경하기
		Writer w = new OutputStreamWriter(System.out);
		w.write('1'); w.write('2'); w.write('3');
		w.write('a'); w.write('b'); w.write('c');
		w.write('가'); w.write('나'); w.write('다');
//		w.flush();
	}
}