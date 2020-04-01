import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * . 타자 연습 게임 프로그램 구현하기
  String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };
  List<String> words = new ArrayList<String>();
  3초에 한번씩 words에 data 중 임의의 이름을 추가하기. 
    => 스레드(DataAddThread)로 작성.
       DataAddThread 스레드는 데몬 스레드로 설정하기
   화면에 입력된 이름과, words에 저장된 이름이 같은 경우 words에서 입력된 이름을 삭제한다.
  words에 모든 데이터가 삭제 되면 프로그램을 종료한다. 

 */
class DataAddThread extends Thread {
	String[] data = {"태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카"};
	List<String> words = new ArrayList<String>();	//삭제될 데이터 저장
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
				System.out.println("게임 종료");
				break;
			}
		}
		
//		List<String> words = new ArrayList<String>();
//		String[] data = {"태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카"};
//		int interval = 3*1000;
//		
//		Scanner scan = new Scanner(System.in);
//		words.add(data[0]);
//		DataAddThread t1 = new DataAddThread(words, data, interval);
//		t1.setDaemon(true);
//		t1.start();		//run()메서드 : interval 만큼 대기하다가 임의의 이름을 words에 추가
//		while(true) {
//			System.out.println(words);
//			System.out.print(">>");
//			String input = scan.next().trim();
//			words.remove(input);
//			if(words.size() == 0) break;
//		}
//		System.out.println("프로그램 종료");
	}
}