package chap6;
/*
 * 2차원 배열 예제
 * 	2차원 배열은 1차원 배열의 참조변수의 배열이다.
 * 	자바에서 n차원 배열은 (n-1)차원 배열의 참조변수의 배열로 표현한다.
 */
public class ArrayEx7 {
	public static void main(String[] args) {
		//1. 2차원 배열의 선언
		int[][] arr = new int[3][2];
		//2. 2차원 배열의 초기화
		arr[0][0] = 10;			arr[0][1] = 20;
		arr[1][0] = 30;			arr[1][1] = 40;
		arr[2][0] = 50;			arr[2][1] = 60;
		//3. 2차원 배열 값 출력
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		// 1차원 배열 객체 변경하기
		int[] arr1 = {1, 2, 3, 4, 5};
		arr[1] = arr1;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}