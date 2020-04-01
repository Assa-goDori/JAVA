package chap8;

class Parent3 {
	int x= 10;
	void method() {
		System.out.println("Parent 메서드");
	}
}

class Child3 extends Parent3 {
	int x = 20;
	void method() {
		int x = 30;
		System.out.println("Child3 메서드");
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
		System.out.println("super.x= " + super.x);
	}
}
public class InstanceOfEx1 {
	public static void main(String[] args) {
		Parent3 p = new Parent3();		// new Child3()인경우 if문 2개 실행
		if(p instanceof Child3) {
			System.out.println("p 참조변수 객체는 Child3 객체다");
			Child3 c = (Child3)p;
			System.out.println(c.x);
			c.method();
		}
		if(p instanceof Parent3) {
			System.out.println("p 참조변수 객체는 Parent3 객체다");
			System.out.println(p.x);
			p.method();
		}
		if(p instanceof Object) {
			System.out.println("p 참조변수 객체는 Object 객체다");
			Object o = p;
//			System.out.println(o.x);	//error : x멤버는 Object의 멤버가 아니다.
//			o.method();					//error : method()멤버는 Object의 멤버가 아니다.
		}
	}
}