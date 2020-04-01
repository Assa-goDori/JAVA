package chap12;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerEx2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("score.txt"));
		int cnt = 0;
		int totalSum = 0;
		while(scan.hasNextLine()) { //읽을 라인이 존재?(enter키로 구분)
			String line = scan.nextLine();	//첫줄을 불러옴
			Scanner scan2 = new Scanner(line).useDelimiter(",");	//,(콤마)를 통해 라인을 분리
			double sum = 0;
			int i = 0;
			String name = scan2.next();	//분리된 라인 중 하나를 읽기
			System.out.print(name + " : ");
			while(scan2.hasNextDouble()) {	//double형의 데이터가 존재?
				double score = scan2.nextDouble();
				sum += score;
				System.out.print(score + ",");
				i++;
			}
			System.out.println(" sum = " + sum + ", avg = " + sum/i);
			cnt++;
		}
		System.out.println("인원수 : " + cnt + "명");
	}
}