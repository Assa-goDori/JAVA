package chap18;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/*
 * IntPredicate �������̽��� �̿�
 * �迭 10������ 1~100������ ������ ��
 */
public class Exam5 {
	private static int[] arr = new int[10];
	public static void main(String[] args) {
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("arr �迭�� ¦�� �� �ִ� ���� : " + maxOrMin(a->a%2==0, (b,c)->(b>c)?b:c));
		System.out.println("arr �迭�� ¦�� �� �ּ� ���� : " + maxOrMin(a->a%2==0, (b,c)->(b<c)?b:c));
		System.out.println("arr �迭�� Ȧ�� �� �ִ� ���� : " + maxOrMin(a->a%2==1, (b,c)->(b>c)?b:c));
		System.out.println("arr �迭�� Ȧ�� �� �ּ� ���� : " + maxOrMin(a->a%2==1, (b,c)->(b<c)?b:c));
		System.out.println("arr �迭�� �ִ� ���� : " + maxOrMin(a->true, (b,c)->(b>c)?b:c));
		System.out.println("arr �迭�� �ִ� ���� : " + maxOrMin(a->true, (b,c)->(b<c)?b:c));
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