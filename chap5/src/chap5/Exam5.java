package chap5;
/*
 * 1~100 ¦���� ��
 */

public class Exam5 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		for(i=1;i<=100;i++) {
			if(i%2==0)	sum += i;
		}
		System.out.println("[for����]1~100 ¦���� ���� : " + sum);
		
		sum = 0;
		i=1;
		while(i<=100) {
			if(i%2==0)	sum += i;
			i++;
		}
		System.out.println("[while����]1~100 ¦���� ���� : " + sum);
		
		sum = 0;
		i=1;
		do {
			if(i%2==0) sum += i;
			i++;
		}while(i<=100);
		System.out.println("[do while����]1~100 ¦���� ���� : " + sum);
		
		sum=0;
		i=1;
		for(i=1;i<=100;i+=2) {
			sum += i;
		}
		System.out.println("1~100 Ȧ���� ���� : " + sum);
	}

}
