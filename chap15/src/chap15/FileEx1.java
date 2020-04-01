package chap15;

import java.io.File;

/*
 * File 클래스
 *   - 파일이나, 폴더의 정보를 관리하고 있는 클래스
 *   - 없는 파일도 관리됨.
 *   
 *   폴더 구분자
 *     윈도우 : \
 *     리눅스, 맥 : /
 *     -> 자바는 플랫폼에 독립적이라 각각 따로 써야하지만 윈도우는 '/', '\' 둘다 가능
 */
public class FileEx1 {
	public static void main(String[] args) {
		String filePath = "c:\\";		// c드라이브(\를 2개를 써야 '\' 문자하나로 인식됨)
		File f1 = new File(filePath);	//f1: c:\\ 정보 관리.
		String files[] = f1.list();		//f1 파일의 하위 정보를 배열로 리턴.
		for(String f : files) {
			File f2 = new File(filePath, f);	// new File(폴더(상위 경로), 파일)
			if(f2.isDirectory())
				System.out.printf("%s : 디렉토리%n", f);
			else if(f2.isFile())
				System.out.printf("%s : 파일(%, dbyte)%n", f, f2.length());
		}
	}
}