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
			System.out.println("서버 대기중");
			Socket client = server.accept();
			System.out.println("플레이어 입장");
			serverThread t1 = new serverThread(client);
			t1.start();
		} catch (IOException e) {e.printStackTrace();}
	}
}
class createNum {
	public Set<Integer> create() {
		Set<Integer> set = new HashSet<Integer>();
		while(set.size()<4) {
			set.add((int)(Math.random()*9)+1);
		}
		return set;
	}
	
}
class serverThread extends Thread {
	Socket client;
	BufferedReader br;
	PrintWriter pw;
	serverThread(Socket client) {
		this.client = client;
		System.out.println("클라이언트 : " + client.getInetAddress() + "입장");
		try {
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
			
		} catch (IOException e) {e.printStackTrace();}
	}
	@Override
	public void run() {
		boolean gameReset = false;
		List<Integer> list = new ArrayList<Integer>(new createNum().create());
		while(true) {
			if(gameReset == true) {
				list = new ArrayList<Integer>(new createNum().create());
				gameReset = false;
			}
			System.out.println(list);	
			try {
				int strike = 0;
				int ball = 0;
				String numbers = br.readLine();
				String[] abc = numbers.split("");
				int[] num = new int[4];
				for(int i=0; i<num.length;i++) {
					num[i] = Integer.parseInt(abc[i]);
//					System.out.println("num배열에 저장된 " + i + "번째 값 : " + num[i]);
				}	
				for(int i = 0; i<list.size(); i++) {
					for(int j = 0; j<num.length; j++) {
						if(list.get(i)==num[j] && i==j) {
							strike++;
						} else if(list.get(i)==num[j] && i!=j) {
							ball++;
						}
					}
				}
				if(strike==4) {
					pw.println("정답입니다!");
					gameReset = true;
					client.close();
				} else {
					pw.println(strike + " 스트라이크 " + ball + " 볼 입니다.");
				}
				pw.flush();
			} catch (IOException e) { e.printStackTrace(); }
		}
	}
}