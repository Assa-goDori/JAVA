package chap18;
/*
 * Runnable 인터페이스를 이용하여 람다식으로 스레드 생성하기
 */
public class LambdaEx2 {
//	static int sum = 0;
	public static void main(String[] args) {
		System.out.println("main 시작");
//		final int sum = 0;
		Runnable r = () -> {	//이름 없는 지역 내부클래스
			int sum = 0;	// 지역내부 클래스에서 지역변수에 접근하고자 할 때는 상수가 되어야 한다.
			for(int i = 0; i<=100; i++) {
				sum += i;
			}
			System.out.println("1부터 100까지의 합 : " + sum);
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(()-> {
			int sum = 0;
			for(int i = 0; i<=100; i++) {
				sum += i;
			}
			System.out.println("1부터 100까지의 합2 : " + sum);
		});
		t1.start(); t2.start();
	}
}