package chap6;

public class ArrayEx11 {
	public static void main(String[] args) {
		//1. 가변배열 선언
		int arr[][] = new int[10][];
		//2. 각 행의 1차원 배열 객체 생성
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];
		}
		//3. 숫자 채우기
		int data = 0;
		for(int j = 9; j>=0; j--) {
			for( int i = j; i<arr.length; i++) {
				arr[i][j] = ++data;
			}
		}
		//4. 결과 출력
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				System.out.printf("%4d\t", arr[i][j]);
			}
		System.out.println();
		}
	}

}
