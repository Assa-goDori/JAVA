package chap15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

/*
 * FileoutputStream을 이용하여 error 로그 파일 생성하기
 */
public class FileoutputStreamEx2 {
	public static void main(String[] args) {
		firstMethod();
	}

	private static void firstMethod() {
		secondMethod();
		
	}

	private static void secondMethod() {
		try {
			throw new Exception("파일에 예외 메세지 저장하기");
		} catch(Exception e) {
			e.printStackTrace();
			try {
				//("error.log", true)
				//error.log : 저장될 파일의 이름. 없으면 생성. 있으면 수정
				//true : 파일 수정시 append 가능. 파일의 이전 내용이 없어지지 않음.
				FileOutputStream fos = new FileOutputStream("error.log", true);
				fos.write(e.getMessage().getBytes());
				e.printStackTrace(new PrintStream(fos));
				fos.write((new Date() + " : =====================\n\n").getBytes());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}