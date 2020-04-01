package chap18;
/*
 * 람다식 예제 : jdk8.0 이후부터 사용가능
 *   람다식에서 사용할 수 있는 인터페이스는 반드시 FunctionalInterface 여야함
 *   
 *   FunctionalInterface : 멤버가 추상메서드가 1개만 존재하는 인터페이스 ex) Runnable 인터페이스 -> void run()
 *   
 *   추상메서드의 매개변수가 없고, 리턴타입도 없는 경우.
 *   () -> {...}
 *   람다식 내부에 실행되는 구문이 한개인 경우 {} 생략 가능.
 */
@FunctionalInterface	// 어노테이션
interface LambdaInterface1 {
	void method();
}
public class LambdaEx1 {
	public static void main(String[] args) {
		//기존 코딩 방식
		LambdaInterface1 f1 = new LambdaInterface1() {	//이름없는 내부클래스
			@Override
			public void method() {
				System.out.println("기존 방식으로 코딩");
			}
		};
		f1.method();
		
		f1 = () -> {
			String str = "method call";
			System.out.println(str);
		};
		f1.method();
		
		f1 = () -> {
			System.out.println("method call2");
		};
		f1.method();
		
		f1 = () -> System.out.println("method call3");
		f1.method();
		
		execute(()->System.out.println("method call4"));
		execute(()->System.out.println("method call5"));
	}
	static void execute(LambdaInterface1 f) {
		f.method();
	}
}