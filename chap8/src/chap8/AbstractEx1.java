package chap8;
/*
 * 추상클래스간의 상속도 가능함
 * 단 부모 추상클래스의 추상메서드를 자손추상클래스에서 오버라이딩 안해도 됨
 */
abstract class Abs1 {
	int a = 10;
	abstract int getA();
}

abstract class Abs2 extends Abs1 {
	int b = 20;
	abstract int getB();
}

class Normal extends Abs2 {
	@Override
	int getB() {
		return b;
	}

	@Override
	int getA() {
		return a;
	}
}

public class AbstractEx1 {
	public static void main(String[] args) {
		Normal n = new Normal();
		System.out.println(n.a);
		System.out.println(n.getA());
		System.out.println(n.b);
		System.out.println(n.getB());
		Abs2 a2 = n;
		System.out.println(a2.a);
		System.out.println(a2.getA());
		System.out.println(a2.b);
		System.out.println(a2.getB());
		Abs1 a1 = n;
		System.out.println(a1.a);
		System.out.println(a1.getA());
//		System.out.println(a1.b);		==> 자식클래스의 변수에 접근 불가
//		System.out.println(a1.getB());  ==> 자식클래스의 메서드에 접근 불가
		Object o = n;
//		System.out.println(o.a);		==> 자식클래스의 변수에 접근 불가
		
		//추상클래스는 객체화 불가
		//a1 = new Abs2();
	}
}