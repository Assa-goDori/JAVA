package chap11;
/*
 * throw : 예외를 강제로 발생
 * throws : 예외 처리(예외 제거)
 */
public class ExceptionEx6 {
	public static void main(String[] args) {
		try {
			throw new Exception("예외 강제 발생");
//			1. Exception 예외 객체 생성
//			2. throw로 JVM에 예외 발생 통지
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}