package chap19;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * IntStream : int 값들의 모임
 */
public class IntStreamEx1 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		System.out.println("Arrays.stream 메서드를 이용하여 IntStream 생성하기");
		IntStream is1 = Arrays.stream(arr);			//배열을 Stream화
		is1.forEach(s->System.out.print(s + "\t"));
		System.out.println("\nIntStream.of 메서드를 이용하여 IntStream 생성하기");
		IntStream is2 = IntStream.of(arr); 
		is2.forEach(s->System.out.print(s + "\t"));	//배열을 Stream화
		System.out.println("\nIntStream.range(1,10) 메서드를 이용하여 IntStream 생성하기");
		IntStream is3 = IntStream.range(1,10);		//1부터 9까지의 숫자를 Stream화
		is3.forEach(s->System.out.print(s + "\t"));
		System.out.println("\nIntStream.rangeClosed(1,10) 메서드를 이용하여 IntStream 생성하기");
		IntStream is4 = IntStream.rangeClosed(1, 10);//1부터 10까지의 숫자를 Stream화
		is4.forEach(s->System.out.print(s + "\t"));
	}
}