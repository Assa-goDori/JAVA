package chap15;
import java.util.*;
import java.io.*;
/*
 * 화면에서 파일명을 입력받고,
 * 화면에 내용을 입력받아서, 입력받은 파일명에 내용을 저장하기
 * "exit" 내용을 입력받으면 입력종료.
 * FileOutputStream 사용하기
 * [결과]
 * aaa.txt
 * 저장할 내용을 입력하세요
 * 안녕하세요
 * 반갑습니다.
 * exit
 * 
 *  aaa.txt 파일의 내용
 *  안녕하세요
 *  반갑습니다.
 */
public class Exam2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String name = scan.next();
		FileOutputStream fos = new FileOutputStream(name, true);
		System.out.println("저장할 내용을 입력하세요");
		while(true) {
			String note = scan.nextLine();
			if(note.equals("exit")) break;
			fos.write((note+"\n").getBytes());
		}
		fos.write(("----------" + new Date() + "---------").getBytes());
		fos.flush();
		fos.close();
		scan.close();
	}
}