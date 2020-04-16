package chap10;
/*
 * 내부 클래스 객체에서 사용되는 this
 *     => 절대 외부 클래스의 멤버에 접근 불가(외부클래스명.this.변수명 으로 접근 가능)
 */
class Outer3 {
	int iv = 10;
	int iv2 = 20; 
	class InstanceInner {
		int iv = 100;
		void method1() {
			int iv = 300;
			System.out.println("iv = " + iv);			//300, 메서드 내부 지역변수 접근
			System.out.println("iv2 = " + iv2);			//20, 외부클래스 내부 인스턴스 멤버 접근
			System.out.println("this.iv = " + this.iv);	//100, 내부클래스 객체 내부 인스턴스멤버 접근
			// 외부 클래스 iv 출력 : Outer3.this => 외부클래스의 객체 의미
			System.out.println("Outer3.this.iv = " + Outer3.this.iv);
		}
	}
	
	static class StaticInner {
		int iv = 100;
		void method1() {
			int iv = 300;
			System.out.println("iv = " + iv);			
			System.out.println("iv2 = " + new Outer3().iv2);	//인스턴스 멤버 접근 시 객체화 필요		
			System.out.println("this.iv = " + this.iv);
			System.out.println("Outer3().iv = " + new Outer3().iv);
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner oi = out.new InstanceInner();
		oi.method1();
		Outer3.StaticInner os = new Outer3.StaticInner();
		os.method1();
	}
}