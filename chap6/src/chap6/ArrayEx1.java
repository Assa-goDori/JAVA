package chap6;
/*
 * 배열 예제1
 */
public class ArrayEx1 {
	public static void main(String[] args) {
		//1. 배열의 선언
		int[] arr1;
		//int arr2[];
		//2. 배열의 생성
		arr1 = new int[5];
		int[] arr2 = new int[10];	//선언과 생성을 동시에 함
		//3. 배열 값을 초기화
		arr1[0] = 10;
		arr1[1] = 20;
		arr2[0] = 100;
		arr2[1] = 200;
		

		arr2 = arr1;
		arr2[2] = 500;
		//4. 배열 값 출력
		System.out.println("arr1 배열");
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]);
		}
		System.out.println("arr2 배열");
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}
	}

}
