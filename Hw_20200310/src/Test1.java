import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean ox = true;
		
		for(int i = 2; i<num; i++) {
			if(num==1)	break;
			if(num%i==0)	ox = false;
		}
		
		if(ox == true && num==1)	System.out.println("1�� �Ҽ��� �ƴմϴ�");
		else if (ox ==true)			System.out.println(num + "�� �Ҽ��Դϴ�.");
		else						System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
	}
}