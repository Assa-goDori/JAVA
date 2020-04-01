package chap18;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

/*
 * Consumer 인터페이스
 *   - Java API의 함수적 인터페이스
 *   - 매개변수는 있고, 리턴타입은 없는 메서드(accept)를 가짐.
 */
public class LambdaEx6 {
	public static void main(String[] args) {
		//accept(String s);
		// t : String 타입
		Consumer<String> c1 = t -> System.out.println(t+8);
		c1.accept("Java");	//Java8
		Consumer<Integer> c11 = t -> System.out.println(t+8);
		c11.accept(100);	//108
		
		//accept(T t, U u);
		BiConsumer<String,String> c2 = (t,u) -> System.out.println(t+u);
		c2.accept("Java", "8.0이후");
		
		//accept(Double d); 제네릭 표현 X
		DoubleConsumer c3 = d-> System.out.println("java"+d);
		c3.accept(8);
		
		//accept(T t, int i); 제네릭 표현 1개
		ObjIntConsumer<String> c4 = (t, i)-> System.out.println(t+i);
		c4.accept("Java", 8);
		
		//accept(int i); 제네릭 X
		IntConsumer c5 = x -> {
			int sum = 0;
			for(int i = 1;i<=x; i++) sum += i;
			System.out.println("1부터 " + x + "까지의 합 : " + sum);
		};
		c5.accept(10);
		c5.accept(100);
	}
}