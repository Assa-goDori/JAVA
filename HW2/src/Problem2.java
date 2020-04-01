import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		int[] score = new int[10];
		int max = 0;
		int min = 100;
		int sum = 0;
		int avg = sum/7;
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 영어 수학 물리 화학 사회 컴퓨터 점수(1~100)를 입력하세요");
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
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + score[9]);
		System.out.println("최대 : " + score[7]);
		System.out.println("최소 : " + score[8]);
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
		System.out.println("\t국어\t영어\t수학\t물리\t화학\t사회\t컴퓨터\t최고점\t최소점\t평균");
	}
}