import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		int port = 8000;
		String ip = "192.168.0.167";
		Socket client = null;
		PrintWriter out = null;
		BufferedReader br = null;
		String input;
		try { 
			String output;
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			client = new Socket(ip, port);
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out = new PrintWriter(client.getOutputStream());
			System.out.println("4개의 숫자를 입력하세요");
			while((input = stdin.readLine()) != null) {
				out.println(input);
				out.flush();
				System.out.println(br.readLine());
			}
			out.close();  br.close(); stdin.close();
		} catch (IOException e) { e.printStackTrace(); }
	}
}