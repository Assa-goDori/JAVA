package chap15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력 받고, 출력할 시작라인 수, 종료 라인 수 입력받아
 * 해당 파일의 시작라인 ~ 종료라인까지만 화면에 출력하기
 * 단, 출력시 해당 라인도 함께 출력할 것.
 * 
 * [결과]
 * 파일명을 입력하세요
 * aaa.txt
 * 출력할 시작라인과, 종료라인의 숫자를 입력하세요
 * 11 12
 * 
 * 11 : sdlflk
 * 12 : adfk
 */
public class Exam3 {
	public static void main(String[] args) throws IOException {
//		Scanner scan = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
//		String name = scan.next();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Filename = br.readLine();
		System.out.println("출력할 시작라인과 종료라인의 숫자를 입력하세요");
//		int start = scan.nextInt();
//		int end = scan.nextInt();
	
		String line = br.readLine();
		int start = Integer.parseInt((line.split(" ")[0].trim()));
		int end = Integer.parseInt((line.split(" ")[1].trim()));
		BufferedReader stdin = new BufferedReader(new FileReader(Filename));
		
		String data = null;
		int cnt = 0;
		while((data = stdin.readLine()) != null) {
			++cnt;
			if(cnt<start) continue;
			if(cnt>end) break;
			System.out.println(cnt + " : " + data);
		}
		br.close();
		stdin.close();
	}
}