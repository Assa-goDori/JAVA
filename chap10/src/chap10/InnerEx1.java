package chap10;
/*
 * 내부 클래스
 * 
 *     static 내부 클래스 : 클래스 내부에 선언되며, 클래스 멤버를 가질 수 있다.
 *     인스턴스 내부 클래스 : 클래스 내부에 선언되며, 클래스 멤버를 가질 수 없다. 단, 상수는 가능함
 *     지역 내부 클래스 : 메서드 내에서 선언된 클래스
 * 
 * 내부 클래스 특징
 *     1. 클래스 내부에 존재하는 클래스
 *     2. 자료형으로 사옹됨. 객체화 가능. Object 클래스의 하위 클래스임.
 *        멤버(변수, 메서드, 생성자)를 가질 수 있다.
 *     3. 외부 클래스의 멤버임. => 외부 클래스에 있는 private멤버에 접근 가능
 *                       => static 내부 클래스 : new 외부 클래스명.내부 클래스명(); 객체 생성 가능
 *                       => 인스턴스 내부 클래스 : 외부 클래스의 객체의 참조 변수.new 내부 클래스명(); 객체 생성 가능
 */
class Outer1 {
	static class StaticInner {			// static 내부 클래스(인스턴스 멤버, 스태틱 멤버, 상수 가능)
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	class InstanceInner {				// 인스턴스 내부 클래스(인스턴스 멤버, 상수 가능)
		int iv = 100;
//		static int cv = 10;
		final static int MAX = 200;		// 상수는 멤버로 가능
	}
	void method() {
		class LocalInner {				// 지역 내부 클래스(인스턴스 멤버, 상수 가능)
			int iv = 600;
//			static int cv = 700;
			final static int MAX = 700;
		}
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv);
		System.out.println(LocalInner.MAX);
	}
	void method2() {
//		LocalInner lc = new LocalInner();		// => 사용불가(메서드 내부에서만 사용 가능함)
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		// Outer1클래스의 메서드 호출하기
		Outer1 o1 = new Outer1();
		o1.method();
		Outer1.StaticInner os = new Outer1.StaticInner();	// 클래스 멤버의 객체화
		System.out.println("os.iv : " + os.iv);
		System.out.println("Outer1.StaticInner.cv : " + Outer1.StaticInner.cv);
		System.out.println("Outer1.StaticInner.MAX : " + Outer1.StaticInner.MAX);
		
		Outer1.InstanceInner oi = o1.new InstanceInner();	// 인스턴스 멤버의 객체화(외부클래스의 객체화 후 객체화 가능)
		System.out.println("oi.iv : " + oi.iv);
		System.out.println("Outer1.InstanceInner.MAX : " + Outer1.InstanceInner.MAX);
		
	}
}