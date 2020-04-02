package chap18;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/*
 * IntPredicate 인터페이스를 이용
 * 배열 10개에는 1~100까지의 임의의 수
 */
public class Exam5 {
	private static int[] arr = new int[10];
	public static void main(String[] args) {
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("arr 배열의 짝수 중 최대 숫자 : " + maxOrMin(a->a%2==0, (b,c)->(b>c)?b:c));
		System.out.println("arr 배열의 짝수 중 최소 숫자 : " + maxOrMin(a->a%2==0, (b,c)->(b<c)?b:c));
		System.out.println("arr 배열의 홀수 중 최대 숫자 : " + maxOrMin(a->a%2==1, (b,c)->(b>c)?b:c));
		System.out.println("arr 배열의 홀수 중 최소 숫자 : " + maxOrMin(a->a%2==1, (b,c)->(b<c)?b:c));
		System.out.println("arr 배열의 최대 숫자 : " + maxOrMin(a->true, (b,c)->(b>c)?b:c));
		System.out.println("arr 배열의 최대 숫자 : " + maxOrMin(a->true, (b,c)->(b<c)?b:c));
	}
	private static int maxOrMin(IntPredicate pr, IntBinaryOperator o) {
		int result = 0;
		for(int i : arr) {
			if(pr.test(i)) {
				if(result == 0) result = i;
				result = o.applyAsInt(result, i);
			}
		}
		return result;
	}
}