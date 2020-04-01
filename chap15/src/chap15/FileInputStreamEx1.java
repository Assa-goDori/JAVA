package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * FileInputStream : 파일의 내용을 읽어 오기. 바이트 입력스트림
 *     int read() : 1byte씩 읽어서 리턴.
 *     int read(byte[] buf) : buf의 크기만큼 읽어서 데이터는 buf에 저장함.
 *                            실제로 읽은 바이트수 리턴.
 *     int read(byte[] buf, int start, int len)
 *                          : buf의 크기에서 len만큼 뺀 데이터를 읽어서
 *                            데이터를 buf의 start인덱스부터 저장함.
 *                            실제로 읽은 바이트 수 리턴.
 */
public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		//fis : src/chap15/InputStreamEx1.java 참조
		FileInputStream fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		System.out.println("===== read() 메서드를 이용하여 읽기 =====");
		int data = 0;
		while((data = fis.read()) != -1) {
			System.out.print((char)data);
		}
		
		System.out.println("\n===== read(byte[] buf) 메서드를 이용하여 읽기 =====");
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		//fis.available() : 읽기 가능 바이트 수. 파일의 바이트 수와 같다.
		byte[] buf = new byte[fis.available()];
		//data : 실제 읽은 바이트수 저장
		//buf : 파일의 내용
//		while((data=fis.read(buf)) != -1) {		//-1 : EOF(파일의 끝)
			data=fis.read(buf);		//굳이 while문을 쓰지 않고 buf자체를 출력해버려도 됨
			System.out.println(new String(buf,0,data));
//		}
		
		System.out.println("\n===== read(byte[] buf, start, len) 메서드를 이용하여 읽기 =====");
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		buf = new byte[fis.available()];
		while((data=fis.read(buf, 0, buf.length)) != -1) {
			System.out.println(new String(buf,0,data));
		}
	}
}