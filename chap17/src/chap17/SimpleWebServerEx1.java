package chap17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServerEx1 {
	public static void main(String[] args) {
		try {
			//ServerSocket : 서버
			//8888 : 포트번호를 Os로부터 할당(바인딩)
			//IP : 컴퓨터 한 개당 한개의 주소가 할당
			//PORT : 논리적인 접속 번호
			//1~1000번 포트 : 공공적인 목적
			//FTP : 21번
			//SSH : 22번
			//Telnet : 25번
			//WebServer: 80번
			ServerSocket server = new ServerSocket(8888);
			while(true) {
				System.out.println("클라이언트 접속 대기");
				Socket client = server.accept();	//클라이언트와 접속 완료
				System.out.println("스레드 생성");
				HttpThread ht = new HttpThread(client);
				ht.start();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	static class HttpThread extends Thread {
		private Socket client;
		BufferedReader br;	//클라이언트의 데이터를 읽기 위한 스트림
		PrintWriter pw;		//클라이언트에 데이터를 출력하기 위한 스트림
		HttpThread(Socket client) {
			this.client = client;
			try {
				//client.getInputStream() : 클라이언트가 전송한 데이터를 입력받기 위한 입력스트림
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				//client.getOutputStream() : 서버가 클라이언트에게 전송한 데이터를 출력하기 위한 출력스트림
				//PrintWriter(new OutputStream("파일명")) -> PrintWriter는 생성자로 OutputStream을 적을 수 있다.
				pw = new PrintWriter(client.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			BufferedReader fbr = null;	// 요청한 파일을 읽을 스트림(index.html)
			try {
				String line = br.readLine();	// 클라이언트가 전송한 데이터
				System.out.println("HTTP Header : " + line);	//  GET/HTTP/1.1
				int start = line.indexOf("/")+1;			//start와 end가 같은 지점을 가리키고 있음 (GET/이후와 HTTP이전 사이)
				int end = line.lastIndexOf("HTTP")-1;
				String fileName = line.substring(start,end);
				if(fileName.equals("")) fileName = "index.html";	// GET/index.html/HTTP/1.1
				System.out.println("사용자 요청 파일 : " + fileName);
				fbr = new BufferedReader(new FileReader(fileName));
				String fileLine = null;
				pw.println("HTTP/1.0 200 OK\r\nContent-Type:text/html\r\n");
				while((fileLine = fbr.readLine()) != null) {
					pw.println(fileLine);
					pw.flush();
				}
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(fbr != null) fbr.close();
					if(br != null) br.close();
					if(pw != null) pw.close();
					if(client != null) client.close();
				} catch (IOException e) { }
			}
		}
		
	}
}