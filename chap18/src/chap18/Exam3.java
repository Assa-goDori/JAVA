package chap18;

import java.util.function.Consumer;
import java.util.function.IntSupplier;

public class Exam3 {
	public static void main(String[] args) {
		IntSupplier s = () -> {
			int sum = 0;
			for(int i = 1; i<=100; i++) sum+= i;
			return sum;
		};
		System.out.println("1부터 100까지의 합 : " + s.getAsInt());
		int[] arr = {10, 20, 30, 40, 50};
		System.out.print("arr 배열 요소들의 합 : ");
		Consumer<int[]> c = i -> {
			int sum = 0;
			for(int a : i) sum+=a;
			System.out.println(sum);
		};
		c.accept(arr);
	}
}