import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * IntStream.rangeClosed �޼��带 �̿��Ͽ�
   �Էµ� ���ڱ����� ��, ¦���� ��, Ȧ���� ���� ���ϴ� ���α׷� �ۼ��ϱ�
 */
public class Test1 {
	static int sum = 0;
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		IntStream is = IntStream.rangeClosed(1, input);
		System.out.println(input + "������ �� : " + is.sum());
		
		IntStream is2 = IntStream.rangeClosed(1, input);
		System.out.println(input + "������ ¦�� �� : " + is2.filter(s->s%2==0).sum());
		
		IntStream is3 = IntStream.rangeClosed(1, input);
		System.out.println(input + "������ Ȧ�� �� : " + is3.filter(s->s%2==1).sum());
	}
}