package chap17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * EchoServerEx1.java ���α׷��� ��Ƽ Ŭ���̾�Ʈ�� ���Ӱ����ϵ��� �����ϱ�
 * Thread ����ؾ���.
 */
public class Exam2 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5000);
			System.out.println("Ŭ���̾�Ʈ ���� ���");
			Socket client = server.accept();
			System.out.println("server : " + server);
			System.out.println("localport : " + server.getLocalPort());
			serverThread t1 = new serverThread(client);
			t1.start();
		} catch (IOException e) { e.printStackTrace(); }
	}
}

class serverThread extends Thread {
	private Socket client;
	PrintWriter out;
	BufferedReader br;
	serverThread(Socket client) {
		this.client = client;
		System.out.println("connected ip : " + client.getInetAddress());
		System.out.println("connected port : " + client.getPort());
		try {
			out = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		String input;
		try {
			while((input = br.readLine()) != null) {
				out.println(input);
				out.flush();
				System.out.println("client data : " + input);
			}
			br.close(); out.close(); client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}