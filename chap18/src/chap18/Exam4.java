package chap18;

import java.util.function.IntBinaryOperator;

/*
 * IntBinaryOperator 인터페이스를 이용하여
 * 배열에 저장된 최대 숫자와 최소 숫자를 출력하기
 * 단, 배열에 저장된 10개의 숫자는 1부터 100까지의 임의의 수로 채우기.
 */
public class Exam4 {
	public static int[] arr = new int[10];
	public static void main(String[] args) {
		for(int i=0; i<arr.length;i++) arr[i] = (int)(Math.random()*100)+1;
		System.out.println("최대값 : " + maxOrMin((a,b)->(a>b)?a:b));
		System.out.println("최소값 : " + maxOrMin((a,b)->(a<b)?a:b));
	}
	private static int maxOrMin(IntBinaryOperator op) {
		int result = arr[0];
		for(int i : arr) {
			result = op.applyAsInt(result, i);
		}
		return result;
	}
}