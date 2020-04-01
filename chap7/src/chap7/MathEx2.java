package chap7;
/*
 * 메서드 종류
 * 클래스 메서드 : 선언부에 static 예약어 기술됨
 * 인스턴스 메서드 : 선언부에 static 예약어가 없음
 */
class Math2 {
	int a, b;
	int add1() {					// 인스턴스 메서드
		return a+b;
	}
	static int add2(int a, int b) {	// 클래스 메서드
		return a+b;
	}
}
public class MathEx2 {
	public static void main(String[] args) {
		Math2 m = new Math2();
		m.a = 10; m.b = 20;
		System.out.println(m.add1());
		System.out.println(Math2.add2(100, 200));
	}
}
