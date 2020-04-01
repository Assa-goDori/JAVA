package chap14;

import java.util.Random;
import java.util.TreeSet;

/*
 * TreeSet ����
 * Lotto��ȣ�� TreeSet�� �̿��Ͽ� ����ϱ�
 * 1~45������ ������ ���ڸ� �ߺ����� 6���� ã�Ƽ� ����ϱ�
 */
public class Exam3 {

	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
//		while(lotto.size()<6) {
//			int num = (int)(Math.random()*45)+1;
//			lotto.add(num);
//		}
//		System.out.println(lotto);
//
		Random num = new Random(45);
		num.setSeed(System.currentTimeMillis());
		while(lotto.size() < 6) {
			int a = num.nextInt(45)+1;
			lotto.add(a);
		}
		System.out.println(lotto);
	}
}