package chap11;
/*
 * throws 예외 처리
 * 
 * 자바에서 예외 처리 : 예외를 제거한다 
 *     1. try-catch 구문
 *     2. throws
 */
public class ExceptionEx5 {
	public static void main(String[] args) {
		try {
			first();
		} catch(Exception e) {
			System.out.println("숫자만 가능합니다.");
			e.printStackTrace();
		}
	}
	private static void first() throws Exception {
		System.out.println("first 메서드");
		second();
	}
	
	private static void second() throws Exception {
		System.out.println("second 메서드");
		System.out.println(Integer.parseInt("abc"));
	}
}