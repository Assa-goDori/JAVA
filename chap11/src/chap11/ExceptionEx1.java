package chap11;
/*
 * 예외처리
 * try 블럭 : 예외가 발생할 가능성이 있는 문장들을 작성
 *          예외가 발생한 경우 catch 블럭이 실행됨
 * catch 블럭 : try 블럭에서 예외가 발생한 경우 호출되는 블럭
 *            try 블럭과 함께 사용되어야함
 */
public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2);
			System.out.print(3/0);	// 예외 발생
			System.out.print(4);
		} catch (ArithmeticException e) {
			System.out.println("\n0으로 나누지 마세요");
		}
		System.out.println(5);
	}
}