package chap15;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 보조스트림
 *    1. 새로운 기능을 추가한 스트림
 *    2. 객체 생성시 다른 스트림을 매개변수로 받는다.   ex) new PrintStream(fos) new InputStream(System.in)
 *       new BufferedReader(Reader)
 *       new BufferedInputStream(InputStream)
 * BufferedReader : 버퍼의 기능을 추가하여 성능을 향상 시킴.
 *     => readLine() : 엔터를 기준으로 한 줄씩 읽을 수 있음
 * 
 * 키보드에서 입력한 내용을 한 줄씩 읽어서 출력하고 buffered.txt 파일에 저장하기
 * Scanner.nextLine() : 키보드 & 파일로 부터 입력받은 내용을 한 줄씩 읽기 => 사용하지 않고 Stream으로만 읽어낼 수 있다.
 */
public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//System.in : InputStream, 출발지
		FileWriter fw = new FileWriter("buffered.txt");	//buffered.txt : 목적지
		String data = null;	//data : 출발지로부터 입력된 내용
		while((data = br.readLine()) != null) {	//ctrl + z = EOF(-1), 파일의 끝
			System.out.println(data);
			fw.write(data + "\n");
		}
		fw.flush();
		fw.close();
	}
}