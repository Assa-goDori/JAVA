package chap15;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1");
		//f1.mkdir() : 폴더 생성. 생성 true / 이미 있는 경우 false
		System.out.printf("%s 폴더 생성 : %b%n", f1.getAbsolutePath(),f1.mkdir());
		File f2 = new File("c:/temp1/test.txt");
		//f2.createNewFile() : 파일 생성. 생성 true / 이미 있는 경우 false
		System.out.printf("%s 파일생성 : %b%n", f2.getAbsolutePath(),f2.createNewFile());
		//f2.getName() : 파일의 이름.
		//f2.length() : 파일의 크기.
		System.out.printf("파일이름 : %s, 파일크기 : %,d byte%n", f2.getName(), f2.length());
		File f3 = new File("c:/temp1/test2.txt");
		//f2.renameTo(f3) : 파일 이름 변경. test.txt -> test2.txt
		System.out.printf("%s->%s 이름변경 : %b%n", f2.getName(), f3.getName(), f2.renameTo(f3));
		//f3.lastModified() : 파일 수정 시간. 1970년 이후 부터 파일수정 일시까지 밀리초 리턴. -> renameTo 메서드 실행 시간
		System.out.printf("%s 파일 최종 수정시간 : %s%n", f3.getName(), new Date(f3.lastModified()));
		//f3.delete() : 파일 삭제.
		System.out.printf("%s 파일 삭제 : %b%n", f3.getName(), f3.delete());
		//파일 내용 입력은 스트림을 이용하여야 함.
	}
}