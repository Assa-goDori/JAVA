package chap6;
/*
 * Math.random() 메서드를 이용하여 1 부터 10까지의 임의의 수를 배열 10개에 저장하기
 * 배열에 저장된 수만큼 * 출력하기
 * arr = {3, 5, 1, ...}
 * 3:***
 * 5:*****
 * 1:*
 * ...
 * 
 * 1. 배열 선언
 * 2. Math.random()로 임의의 수를 생성하여 배열에 저장
 * 3. 배열의 값 만큼 * 출력 => 배열의 값만큼 반복
 */
public class Exam3 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		for(int i = 0; i<arr.length;i++) {
			int num = (int) (Math.random()*10+1);
			arr[i] = num;
			System.out.print("arr[" + i + "] = " + arr[i] + " ");
			for(int k = 1; k<=arr[i];k++) {
				System.out.print("*");
			}
			// for(int k : arr) {
			//		for(int j=0; j<k; k++) {
			//			System.out.print("*");
			//		}
			//	}
			System.out.println();
		}
	}

}
