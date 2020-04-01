package chap15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * ȭ�鿡�� ���ϸ��� �Է� �ް�, ����� ���۶��� ��, ���� ���� �� �Է¹޾�
 * �ش� ������ ���۶��� ~ ������α����� ȭ�鿡 ����ϱ�
 * ��, ��½� �ش� ���ε� �Բ� ����� ��.
 * 
 * [���]
 * ���ϸ��� �Է��ϼ���
 * aaa.txt
 * ����� ���۶��ΰ�, ��������� ���ڸ� �Է��ϼ���
 * 11 12
 * 
 * 11 : sdlflk
 * 12 : adfk
 */
public class Exam3 {
	public static void main(String[] args) throws IOException {
//		Scanner scan = new Scanner(System.in);
		System.out.println("���ϸ��� �Է��ϼ���");
//		String name = scan.next();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Filename = br.readLine();
		System.out.println("����� ���۶��ΰ� ��������� ���ڸ� �Է��ϼ���");
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