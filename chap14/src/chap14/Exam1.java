package chap14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
 * ȭ�鿡�� Ȧ������ ���ڸ� �Է¹޾Ƽ� �Է¹��� ������ ��հ� �߰��� ����ϱ�
 * 
 * 10 40 30 60 30
 * 
 * ���� : 10 30 30 40 60
 * �߰��� : 30
 * ��� : 34  (��ü��/����)
 */
public class Exam1 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ȧ������ ���ڸ� �Է��ϼ���(���� : 999)");
		List<Integer> list = new ArrayList<Integer>();

		while(scan.hasNextInt()) {
			int input = scan.nextInt();
			if(input == 999) break;
			list.add(input);
			sum += input;
			
		}
		//¦���� �Է½�  ������ �Էµ� ������ �����ϱ�
		if(list.size()%2 == 0) list.remove(list.size()-1);
		System.out.println("list : " + list);
		Collections.sort(list);
		System.out.println("���� list : " + list);
		System.out.println("�Է� ������ �� : " + sum);
		System.out.println("�Է� ������ ��� : " + sum/(list.size()));
		System.out.println("�Է� ������ �߰� �� : " + list.get(list.size()/2));
		scan.close();
	}
}