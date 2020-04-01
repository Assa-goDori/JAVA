package chap10;
/*
 * 외부 클래스와 내부 클래스의 상호 호출
 */
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner { 
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner {
//		int siv = new Outer2().outeriv;		//클래스 멤버에서 인스턴스 멤버 호출시 객체화 필요
		static int scv = outercv;
	}
	static StaticInner cv = new StaticInner();
	InstanceInner iv = new InstanceInner();
	static InstanceInner cv2 = new Outer2().new InstanceInner();
	StaticInner iv2 = new StaticInner();
	
	void method(final int pv) {
//		pv++;
		int num=100;	// final int num = 100;
//		num++;
		class LocalInner { 
			int liv = outeriv;		// 지역 내부 클래스에서 외부 클래스의 private 멤버 접근 가능
			int liv2 = outercv;
			void method() {
				//지역 내부 클래스에서 외부 메서드의 지역변수 사용시, 해당 지역변수는 상수화가 되어야 함.
				System.out.println("pv = " + pv);
				System.out.println("num = " + num);		// num++ 적용시 에러(상수이어야 함)
				System.out.println("liv = " + liv);
				System.out.println("outeriv = " + outeriv);
			}
		}
		LocalInner li = new LocalInner();
		li.method();
	}
}
public class InnerEx2 {
	public static void main(String[] args) {
//		InstanceInner 클래스 객체화 하기
		Outer2.InstanceInner in = new Outer2().new InstanceInner();
		System.out.println("iiv = " + in.iiv);
		System.out.println("iiv2 = " + in.iiv2);
//		StaticInner 클래스 객체화 하기
		Outer2.StaticInner sn = new Outer2.StaticInner();
		System.out.println("scv = " + Outer2.StaticInner.scv);
//		method() 호출하기
		new Outer2().method(100);
	}
}