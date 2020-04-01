import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * . Ÿ�� ���� ���� ���α׷� �����ϱ�
  String[] data = { "�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī" };
  List<String> words = new ArrayList<String>();
  3�ʿ� �ѹ��� words�� data �� ������ �̸��� �߰��ϱ�. 
    => ������(DataAddThread)�� �ۼ�.
       DataAddThread ������� ���� ������� �����ϱ�
   ȭ�鿡 �Էµ� �̸���, words�� ����� �̸��� ���� ��� words���� �Էµ� �̸��� �����Ѵ�.
  words�� ��� �����Ͱ� ���� �Ǹ� ���α׷��� �����Ѵ�. 

 */
class DataAddThread extends Thread {
	String[] data = {"�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī"};
	List<String> words = new ArrayList<String>();	//������ ������ ����
	public void run() {
		while(true) {
			words.add(data[(int)(Math.random()*data.length)]);
			try {
				sleep(3000);
			} catch (InterruptedException e) { }
		}
	}
}

//class DataAddThread extends Thread {
//	List<String> words;
//	String[] data;
//	int interval;
//	public DataAddThread(List<String> words, String[] data, int interval) {
//		this.words = words;
//		this.data = data;
//		this.interval = interval;
//	}
//	@Override
//	public void run() {
//		while(true) {
//			try {
//				sleep(interval);
//			} catch (InterruptedException e) {}
//			words.add(data[(int)(Math.random()*data.length)]);
//		}
//	}
//}

public class Test1 {
	public static void main(String[] args) {
		DataAddThread t = new DataAddThread();
		t.setDaemon(true);
		t.start();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println(t.words);
			System.out.print(">>");
			String input = scan.next();
			if(t.words.indexOf(input) != -1) {
				t.words.remove(input);
			}
			if(t.words.isEmpty()) {
				System.out.println("���� ����");
				break;
			}
		}
		
//		List<String> words = new ArrayList<String>();
//		String[] data = {"�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī"};
//		int interval = 3*1000;
//		
//		Scanner scan = new Scanner(System.in);
//		words.add(data[0]);
//		DataAddThread t1 = new DataAddThread(words, data, interval);
//		t1.setDaemon(true);
//		t1.start();		//run()�޼��� : interval ��ŭ ����ϴٰ� ������ �̸��� words�� �߰�
//		while(true) {
//			System.out.println(words);
//			System.out.print(">>");
//			String input = scan.next().trim();
//			words.remove(input);
//			if(words.size() == 0) break;
//		}
//		System.out.println("���α׷� ����");
	}
}