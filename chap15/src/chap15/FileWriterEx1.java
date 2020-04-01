package chap15;

import java.io.FileWriter;
import java.io.IOException;
/*
 * FileWriter 예제 : 파일의 텍스트 데이터 출력.
 *                 파일이 존재하지 않으면 파일 생성.
 *                 파일이 존재하면 파일에 수정.
 *     void write(int data) : 1char(2byte) 출력
 *     void write(char[] buf) : buf의 내용을 파일에 출력
 *     void write(char[] buf, start, len) : buf의 start인덱스부터의 내용을 len의 크기만큼 파일에 출력
 *     void write(String data) : 문자열 출력.
 */
public class FileWriterEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("output2.txt 파일에 출력됩니다");
		//fos : out.txt 파일을 쓰기 위해 참조함.
		FileWriter fos = new FileWriter("output.txt");
		fos.write('1'); fos.write('2'); fos.write('3');
		fos.write('c'); fos.write('b'); fos.write('c');
		fos.write('가'); fos.write('나'); fos.write('다');
		char[] buf = "\n반갑습니다. FileOutputStream 예제 입니다.\n".toCharArray();
		fos.write(buf);
		fos.write(buf,1,6);
		fos.write("안녕하세요. 홍길동 입니다.");
		fos.flush();
		fos.close();
	}
}