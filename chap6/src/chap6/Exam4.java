package chap6;

import java.util.Arrays;

/*
 * 1부터 9까지의 숫자 중 중복되지 않는 숫자 3개 생성 후 정렬하여 출력
 * 
 * 1. 1~9 저장한 배열 선언.
 * 2. 선택 숫자를 저장할 배열 선언. 3개 값을 저장.
 * 3. 1~9 배열을 섞기
 * 4. 섞인 배열에서 3개의 숫자를 서택된 배열에 저장
 * 5. 선택된 배열을 정렬하여 출력
 */
public class Exam4 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] b = new int[3];
		
		for(int j = 0; j<10; j++) {
			int f = (int)(Math.random()*10-1);
			int h = (int)(Math.random()*10-1);
			int temp = a[f];
			a[f] = a[h];
			a[h] = temp;
		}
				
		System.out.print("중복되지 않는 3자리 숫자 : ");
		
		for(int k = 0; k<b.length; k++) {
			b[k] = a[k];
			System.out.print(b[k]);
		}
		
//		for(int i = 0; i<b.length;i++) {
//			for(int j = 0; j<b.length-1;j++) {
//				if(b[j]>b[j+1]) {
//					int tmp = b[j];
//					b[j] = b[j+1];
//					b[j+1] = tmp;
//				}
//			}
//		}
		Arrays.sort(b);			// 배열을 정렬해주는 메서드.
		System.out.print("\n" + "정렬 후 3자리 숫자 : ");
		for(int i : b) {
			System.out.print(i);
		}
		
	}
}
