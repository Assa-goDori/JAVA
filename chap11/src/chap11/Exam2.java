package chap11;
/*
 * 자바에서 예외처리는 필수임.
 * 단, RuntimeException 애외는 예외처리를 생략 할 수 있다.
 * => 예외는 RumtimeException과 그 외 Exception으로 나뉜다.
 * => RuntimeException 클래스의 하위 클래스도 예외처리 생략 가능.
 */
public class Exam2 {
	public static void main(String[] args) {
		throw new RuntimeException("예외 강제 발생"); // 예외 처리 하지 않고 컴파일오류 막는법

	}
}