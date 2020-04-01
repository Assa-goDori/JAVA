/*
 * 1 ~ 99까지의 정수를 입력받아서 TreeSet에 저장하고, 0 을 입력하면 입력을 종료한다. 
 * 입력된 값을 정렬하여 출력하기.
   1 ~ 99 까지의 숫자가 아닌 경우 TreeSet에서 저장하지 말것.
 * 
 * set1 오름차순 정렬되도록 출력.
 * set2 내림차순 정렬되도록 출력하기. 
 */
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class OutOfIndexNumException extends Exception {
	public String toString() {
		return "은 범위 내의 정수가 아니므로 TreeSet에 저장하지 않습니다.";
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
		
		System.out.println("1~99 까지의 정수를 입력하세요(종료 : 0)");
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
		System.out.println("오름차순 정렬 : " + set1);
		System.out.println("내림차순 정렬 : " + set2);		
	}
}