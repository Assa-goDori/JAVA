import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * IntStream.rangeClosed 메서드를 이용하여
   입력된 숫자까지의 합, 짝수의 합, 홀수의 합을 구하는 프로그램 작성하기
 */
public class Test1 {
	static int sum = 0;
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		IntStream is = IntStream.rangeClosed(1, input);
		System.out.println(input + "까지의 합 : " + is.sum());
		
		IntStream is2 = IntStream.rangeClosed(1, input);
		System.out.println(input + "까지의 짝수 합 : " + is2.filter(s->s%2==0).sum());
		
		IntStream is3 = IntStream.rangeClosed(1, input);
		System.out.println(input + "까지의 홀수 합 : " + is3.filter(s->s%2==1).sum());
	}
}