package chap6;
/*
 * 2차원배열의 행의 합과 열의 합 구하기
 */
public class Exam6 {
	public static void main(String[] args) {
		int arr[][] = {{1}, {10,20}, {30, 40, 50}, {60,70, 80, 90}};

		for(int i=0; i<arr.length;i++) {
			int sum1=0;
			for(int j = 0; j<arr[i].length;j++) {
				sum1 += arr[i][j];
			}
			System.out.println(i + "행의 합 : " + sum1);
		}
		
		for(int i=0; i<arr.length;i++) {
			int sum2 = 0;
			for(int j=i; j<arr.length; j++) {
				sum2 += arr[j][i];
			}
			System.out.println(i + "열의 합 : " + sum2);
		}
		
		
	}
}

//00
//10+11
//20+21+22
//30+31+32+33

//00 + 10+ 20+ 30
//11+21+31
//22+32
//33
