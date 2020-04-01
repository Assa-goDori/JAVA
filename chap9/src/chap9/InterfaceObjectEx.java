package chap9;
/*
 * 인터페이스 객체 생성하기
 */

interface Action {
	void action();
}
abstract class Abs {
	abstract void method();
}
public class InterfaceObjectEx {
	public static void main(String[] args) {
		//이름 없는 내부 클래스  => 일회성 객체로 생성
		Action a = new Action() {
			@Override
			public void action() {
				System.out.println("인터페이스의 객체 1");
			}
		};
		a.action();
		a = new Action() {
			@Override
			public void action() {
				System.out.println("인터페이스의 객체 2");	//인터페이스의 객체1은 사라짐
			}
		};
		a.action();
		
		Abs ab = new Abs() {
			@Override
			void method() {
				System.out.println("추상클래스의 객체 1");
			}
		};
		ab.method();
		
		//jdk 8.0 이후 람다 방식으로 처리하기 : 인터페이스만 가능, 추상클래스 불가능
		a = () -> System.out.println("인터페이스를 람다식으로 처리");
		a.action();
	}
}