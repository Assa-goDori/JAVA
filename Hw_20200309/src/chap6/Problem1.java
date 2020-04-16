package chap6;
/*
 * 1. 1부터 100까지 임의의 수 10개를 배열에 저장하고 정렬하여 출력하기
 */
public class Problem1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp; 
				}
			}
		}
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}
