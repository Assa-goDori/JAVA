/*
 * 1 ~ 99������ ������ �Է¹޾Ƽ� TreeSet�� �����ϰ�, 0 �� �Է��ϸ� �Է��� �����Ѵ�. 
 * �Էµ� ���� �����Ͽ� ����ϱ�.
   1 ~ 99 ������ ���ڰ� �ƴ� ��� TreeSet���� �������� ����.
 * 
 * set1 �������� ���ĵǵ��� ���.
 * set2 �������� ���ĵǵ��� ����ϱ�. 
 */
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class OutOfIndexNumException extends Exception {
	public String toString() {
		return "�� ���� ���� ������ �ƴϹǷ� TreeSet�� �������� �ʽ��ϴ�.";
	}
}

public class Test1 {
	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		
		System.out.println("1~99 ������ ������ �Է��ϼ���(���� : 0)");
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				int input = scan.nextInt();
				if(input == 0) break;
				if(input<1 || input>99) {
					System.out.print(input);
					throw new OutOfIndexNumException();
				}
				set1.add(input);
				set2.add(input);
			} catch (OutOfIndexNumException e) {
				System.out.println(e);
				continue;
			}
		}
		System.out.println("�������� ���� : " + set1);
		System.out.println("�������� ���� : " + set2);		
	}
}