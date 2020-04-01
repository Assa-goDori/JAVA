package chap18;

interface LambdaInterface5 {
	void method();
}
class Outer {
	public int iv = 10;
	void method() {
		final int iv = 20;	//지역변수 -> 상수화
		LambdaInterface5 f5 = () -> {
//			int iv = 30;	상수화가 되어야 한다. 새로운 변수값 입력 불가
			System.out.println("Outer.this.iv : " + Outer.this.iv);
			System.out.println("this.iv : " + this.iv);
			System.out.println("iv : " + iv);
		};
		f5.method();
	}
}
public class LambdaEx5 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}