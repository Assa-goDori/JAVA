package chap16;
/*
 * join() : 스레드가 종료할 때까지 대기
 */
class Thread100 extends Thread {
	int sum = 0;
	public void run() {
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
	}
}
public class ThreadEx5 {
	public static void main(String[] args) {
		Thread100 t = new Thread100();
		t.start();
		try {
			t.join();	//t스레드가 종료할 때 까지 main스레드 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~100까지의 합 : " + t.sum);
	}
}