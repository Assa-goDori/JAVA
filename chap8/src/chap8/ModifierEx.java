package chap8;

import chap8.test.Modifier2;

/*
 * 접근 제한자
 *     private < (default) < protected < public
 */

class Modifier {
	private int v1 = 100;
			int v2 = 200;
	protected int v3 = v1;
	public void method() {
		System.out.println("chap8.Modifier.method() 메서드임");
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
	}
}

class Modifier3 extends Modifier2 {
	public void method() {
//		System.out.println("v1 = " + v1);		// private 접근 안됨
//		System.out.println("v2 = " + v2);		// (default) 같은 패키지가 아니므로 접근 안됨
		System.out.println("v3 = " + v3);		// protected 이므로 다른 패키지더라도 상속관게에서 접근 가능
		System.out.println("v4 = " + v4);		// public 모두 접근 가능
	}
}
public class ModifierEx {
	public static void main(String[] args) {
		Modifier m1 = new Modifier();
//		System.out.println(m1.v1);		// v1변수의 접근 제한자가 private 이므로 접근 불가
		System.out.println(m1.v2);
		System.out.println(m1.v3);
		m1.method();
		Modifier3 m3 = new Modifier3();
//		System.out.println("m3.v1 = " + m3.v1);		//같은 클래스가 아니라 접근 안됨
//		System.out.println("m3.v2 = " + m3.v2);		//패키지가 달라서 접근이 안됨
//		System.out.println("m3.v3 = " + m3.v3);		//Modifier2와 ModifierEx는 상속관계가 아니라 접근 안됨
		System.out.println("m3.v4 = " + m3.v4);
	}
}