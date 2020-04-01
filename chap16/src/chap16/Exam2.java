package chap16;
/*
 * 1���� 500������ ���� ���ϱ�
 * Thread Ŭ������ ��ӹ��� SumThread Ŭ���� �����ϱ�
 */
class SumThread extends Thread {
	int sum = 0;
	int a, b;

	SumThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void run() {
		for (int i = a; i <= b; i++) {
			sum += i;
		}
	}
}

public class Exam2 {
	public static void main(String[] args) {
		SumThread[] arr = new SumThread[5];
		arr[0] = new SumThread(1, 100);
		arr[1] = new SumThread(101, 200);
		arr[2] = new SumThread(201, 300);
		arr[3] = new SumThread(301, 400);
		arr[4] = new SumThread(401, 500);
		int sum = 0;
		for (SumThread t : arr) {
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
			}
			sum += t.sum;
		}
		System.out.printf("1~500������ �� : %,d", sum);
	}
}