package chap6;
/*
 * 5명 학생의 국어, 영어, 수학 점수를 학생별로 총점, 평균을 구하고, 과목별 총점과 평균 출력하기
 * [결과]
 * 			국어	영어	수학	총점	평균
 * 1번학생 : 100	80	90	270	90.0
 * 2번학생 : 100	80	90	270	90.0
 * 3번학생 :	...
 * 4번학생 :
 * 5번학생 : 10	80	90	270	90.0
 * 과목총점 : 500 400	450
 * 과목평균 : 100	80	90
 */
public class Exam5 {
	public static void main(String[] args) {
//		int[][] arr = new int[5][3];
//		arr[0][0] = 100;	arr[0][1] = 80;		arr[0][2] = 90;
//		arr[1][0] = 100;	arr[1][1] = 80;		arr[1][2] = 90;
//		arr[2][0] = 100;	arr[2][1] = 80;		arr[2][2] = 90;
//		arr[3][0] = 100;	arr[3][1] = 80;		arr[3][2] = 90;
//		arr[4][0] = 100;	arr[4][1] = 80;		arr[4][2] = 90;

		System.out.println("\t국어" + "\t영어" + "\t수학" + "\t총점" + "\t평균");
		
		//2차원 배열의 선언, 생성, 초기화
		int[][] arr = {{100, 80, 90}, {90, 85, 75}, {70, 80, 90}, {95, 85, 75}, {60, 65, 95}};
		
		int[] tot = new int[3];
		
		for(int i = 0; i<arr.length; i++) {
			int sum = 0;
			System.out.print((i+1) + "번학생 : ");
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				sum += arr[i][j];
				tot[j] += arr[i][j];
			}
//		System.out.println(sum + "\t" + (double)sum/arr[i].length);
		System.out.printf("%d\t%.2f\n", sum, (double)sum/arr[i].length);

		}
		
		System.out.print("과목총점 : ");
		for(int i = 0; i<tot.length;i++) {
			System.out.print(tot[i] + "\t");
		}
		System.out.println();
		System.out.print("과목평균 : ");
		for(int i = 0; i<tot.length;i++) {
			System.out.print((double)(tot[i]/arr.length)+"\t");
		}

		
		
//		//과목총점
//		System.out.print("과목총점 : ");
//		for(int i = 0; i<arr[i].length; i++) {
//			int asum = 0;
//			for(int j = 0; j<arr.length; j++) {
//				asum += arr[j][i];
//			}
//		System.out.print(asum + "\t");
//		}
//		System.out.println();
//		//과목평균
//		System.out.print("과목평균 : ");
//		for(int i = 0; i<arr[i].length; i++) {
//			int asum = 0;
//			for(int j = 0; j<arr.length; j++) {
//				asum += arr[j][i];
//			}
//		System.out.print((double)asum/arr.length + "\t");
//		}
	}
}