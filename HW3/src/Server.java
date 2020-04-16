import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				System.out.println("서버 대기중");
				Socket client = server.accept();
				System.out.println("플레이어 입장");
				serverThread t1 = new serverThread(client);
				t1.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class serverThread extends Thread {
	Socket client;
	BufferedReader br;
	PrintWriter pw;
	List<Integer> list;
	int[] num;
	String[] abc;


	serverThread(Socket client) {
		
		this.client = client;
		System.out.println("클라이언트 : " + client.getInetAddress() + "입장");
		try {
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Integer> createNum() {
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() < 4) {
			set.add((int) (Math.random() * 9) + 1);
		}
		List<Integer> list = new ArrayList<Integer>(set);
		return list;
	}
	
	public boolean checkGame(List<Integer> list, String s) throws IOException {
		int strike = 0;
		int ball = 0;
		num = new int[4];
		abc = s.split("");
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(abc[i]);
		}
		for(int a : num) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < num.length; j++) {
				if (list.get(i) == num[j] && i == j) {
					strike++;
				} else if (list.get(i) == num[j] && i != j) {
					ball++;
				}
			}
		}
		if (strike == 4) {
			pw.println("정답입니다!");
			return true;
		} else {
			pw.println(strike + " 스트라이크 " + ball + " 볼 입니다.");
			return false;
		}
	}

	@Override
	public void run() {
		String numbers;
		try {
			list = createNum();
			System.out.println(list);
			while ((numbers = br.readLine()) != null) {	
				if(checkGame(list, numbers)) {
					break;
				}
				pw.flush();
			}
			br.close(); pw.close(); client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}