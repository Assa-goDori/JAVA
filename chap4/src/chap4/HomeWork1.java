package chap4;
import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		String result = score>=90?"A����":(score>=80?"B����":(score>=70)?"C����":(score>=60)?"D����":"F����");
		System.out.println(result);

	}

}
