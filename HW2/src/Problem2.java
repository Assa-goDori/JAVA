import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		int[] score = new int[10];
		int max = 0;
		int min = 100;
		int sum = 0;
		int avg = sum/7;
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ���� ���� ���� ȭ�� ��ȸ ��ǻ�� ����(1~100)�� �Է��ϼ���");
		for(int i =0; i<7;i++) {
			score[i] = scan.nextInt();
		}
		
		for(int i = 0; i<7;i++) {
			sum += score[i];
			
			if(score[i]>max) {
				max = score[i];
				score[7] = max;
			}
			
			if(score[i]<min) {
				min = score[i];
				score[8]= min;
			}
			
		}
		score[9] = sum/7;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + score[9]);
		System.out.println("�ִ� : " + score[7]);
		System.out.println("�ּ� : " + score[8]);
		System.out.println();
		
		for(int i = 0; i<10; i++) {
			System.out.print((100-10*i) + "\t");
			for(int j = 0; j<10; j++) {
				if(i>=(10-(score[j]/10))) {
					System.out.print("*\t");
				} else {
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
		System.out.println("\t����\t����\t����\t����\tȭ��\t��ȸ\t��ǻ��\t�ְ���\t�ּ���\t���");
	}
}