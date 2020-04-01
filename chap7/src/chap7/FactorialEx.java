package chap7;
/*
 * 재귀 함수 연습
 * 	재귀함수 : 자신의 함수를 다시 호출하는 함수
 * 		=> Stack 영역이 존재하므로 가능함.
 */
public class FactorialEx {
	public static void main(String[] args) {
		System.out.println("5!=" + factorial(5));	//5x4x3x2x1=120
	}

	private static int factorial(int i) {
		return (i==1)?1:i*factorial(i-1);
	}

}
