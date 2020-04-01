package chap12;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerEx2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("score.txt"));
		int cnt = 0;
		int totalSum = 0;
		while(scan.hasNextLine()) { //���� ������ ����?(enterŰ�� ����)
			String line = scan.nextLine();	//ù���� �ҷ���
			Scanner scan2 = new Scanner(line).useDelimiter(",");	//,(�޸�)�� ���� ������ �и�
			double sum = 0;
			int i = 0;
			String name = scan2.next();	//�и��� ���� �� �ϳ��� �б�
			System.out.print(name + " : ");
			while(scan2.hasNextDouble()) {	//double���� �����Ͱ� ����?
				double score = scan2.nextDouble();
				sum += score;
				System.out.print(score + ",");
				i++;
			}
			System.out.println(" sum = " + sum + ", avg = " + sum/i);
			cnt++;
		}
		System.out.println("�ο��� : " + cnt + "��");
	}
}