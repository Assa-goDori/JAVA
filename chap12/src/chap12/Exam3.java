package chap12;
/*
 * 결과가 나오도록 round 함수 구현하기
 * 
 * double round(float 실수형, int 소수점이하 자리수)
 */

public class Exam3 {
	public static void main(String[] args) {
		System.out.println(round(3.12345, 1));	//3.1
		System.out.println(round(3.12345, 2));	//3.12
		System.out.println(round(3.12345, 3));	//3.123
		System.out.println(round(3.12345, 4));	//3.1235(자동 반올림)
		System.out.println(truncate(3.12345, 1));	//3.1
		System.out.println(truncate(3.12345, 2));	//3.12
		System.out.println(truncate(3.12345, 3));	//3.123
		System.out.println(truncate(3.12345, 4));	//3.1234
		
	}
	
	static double round(double d, int a) {
		return Double.parseDouble(String.format("%." + a +"f", d));
	}
	/*
	 * 3.12345, 1 =>3.12345 * 10
	 * 31.2345 => (int)31 => 31/10.0 => 3.1
	 */
	static double truncate(double d, int i) {
		int num10 = 1;
		for(int a = 0; a<i; a++) {
			num10*=10;
		}
		return (int)(d*num10)/(double)num10;
		
	}
}