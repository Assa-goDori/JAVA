package chap16;
/*
 * 1부터 500까지의 합을 구하기
 * Runnable 인터페이스를 구현한 SumRunnable 클래스 구현하기
 */

class SumRunnable implements Runnable {
	int a, b, sum;
	SumRunnable(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void run() {
		for(int i=a; i<=b; i++)
			sum +=i;
	}
}
public class Exam3 {
	public static void main(String[] args) {
		SumRunnable[] arr = new SumRunnable[5];
//		arr[0] = new SumRunnable(1, 100);
//		arr[1] = new SumRunnable(101, 200);
//		arr[2] = new SumRunnable(201, 300);
//		arr[3] = new SumRunnable(301, 400);
//		arr[4] = new SumRunnable(401, 500);
		for(int i = 0; i<arr.length;i++) {
			arr[i] = new SumRunnable((i*100)+1, (i+1)*100);
		}
		int sum = 0;
		for(SumRunnable s : arr) {
			Thread t = new Thread(s);
			t.start();
			try {
				t.join();	//해당 Thread가 종료할 때 까지 대기
			} catch (InterruptedException e) { }
			sum += s.sum;
		}
		System.out.printf("1~500까지의 합 : %,d", sum);
	}
}