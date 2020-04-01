package chap15;

import java.io.File;

/*
 * c:\Windows 폴더를 지정하여 폴더의 하위 폴더 갯수(디렉토리)와 파일의 갯수, 파일의 총크기 출력하기
 */
public class Exam4 {
	public static void main(String[] args) {
		int dir = 0, fcnt = 0;
		long fsum = 0;
		String filename = "c:\\Windows";
		File f1 = new File(filename);
		String[] files = f1.list();	// c:\\Windows 폴더의 하위 정보 배열로 리턴
		for(String s : files) {
			File f2 = new File(filename, s);
			if(f2.isDirectory()) {
				++dir;
			} else if(f2.isFile()) {
				++fcnt;
				fsum += f2.length();
			}
		}
		System.out.println("폴더의 갯수 : " + dir + "개");
		System.out.println("파일의 갯수 : " + fcnt + "개");
		System.out.printf("파일의 총 크기 : %,dbyte",fsum);
	}
}