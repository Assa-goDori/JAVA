package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받아 해당 파일의 내용을 화면에 출력하기
 * 한글 깨지지 않도록 하고, FileInputStream을 이용하기.
 * 해당파일이 없는 경우 "해당 파일 없음" 메세지 출력.
 */
public class Exam1 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String file = scan.next();
		try {
			FileInputStream fis = new FileInputStream("src/chap15/" + file + ".java");
			byte[] buf = new byte[fis.available()];
			int data = 0;
			data = fis.read(buf);
			System.out.println(new String(buf, 0, buf.length));
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일 없음");
		}
	}
}