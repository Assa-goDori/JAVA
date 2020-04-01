import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
 * ���� ����� �������� ���α׷��� �ۼ��Ͻÿ�
 1 ~ 1000�������� ��ȣ�� ������ ������ �ִ�.
 1�� 1��, 2�� 2��, 3�� 3�� �� ��÷�ϴ� ���α׷� �ۼ��ϱ�
  �� ��÷�� 3����� ��÷�ϰ�, ��÷��ȣ�� �ߺ��Ǹ� �ȵȴ�.
  ��÷�� ��ȣ�� ������ ���̹Ƿ� ���� ���� ���� �Ҷ� ���� �ٸ���.

  LinkedHashSet : ��������, �ߺ��Ұ�
  Random
  new ArrayList(Set) : Set ��ü�� List��ü�� ����

 [���]
3�� ���� ��÷�մϴ�.
945
123
6
2�� ���� ��÷�մϴ�.
611
404
1�� ���� ��÷�մϴ�.
797

*** ���� ��÷ ��� ***

1��:797,
2��:404,611,
3��:6,123,945,
 */
public class Test2 {
	public static void main(String[] args) {
		Random ran = new Random();
		ran.setSeed(System.currentTimeMillis());
		Set<Integer> lotto = new LinkedHashSet<Integer>();
		
//		for(int i = 3, size = 0; i>0; i--) {
//			System.out.println(i + "�� ���� ��÷�մϴ�.");
//			while(lotto.size()<size+i) {
//				int num = ran.nextInt(1000)+1;
//				lotto.add(num);
//				System.out.println(num);
//			}
//			size += i;
//		}
//
//		List<Integer> lotto2 = new ArrayList<Integer>(lotto);
//		System.out.println("***���� ��÷ ���***");
//		for(int i=1; i<=3;i++) {
//			System.out.print((i+1) + "�� : ");
//			for(int j = 0; j<i;j++) {
//				System.out.print(lotto2.get(6-i-j) + ",");
//			}
//			System.out.println();
//		}
		
		while(lotto.size()<6) {
			int num = ran.nextInt(1000)+1;
			lotto.add(num);
		}
		List<Integer> lotto2 = new ArrayList<Integer>(lotto);
		for(int i = 3, index = 0; i>0; i--) {
			System.out.println(i + "�� ���� ��÷�մϴ�.");
			for(int j = i; j>0; j--) {
				System.out.println(lotto2.get(index++));
			}	
		}
		System.out.println("***���� ��÷ ���***");
//		for(int i = 1, index = lotto2.size()-1; i<=3; i++) {
//			System.out.print(i + "�� : ");
//			for(int j = 0; j<i; j++) {
//				System.out.print(lotto2.get(index--) + ",");
//			}
//			System.out.println();
//		}
		System.out.println("1�� : " + lotto2.subList(5, 6));
		System.out.println("2�� : " + lotto2.subList(3, 5));
		System.out.println("3�� : " + lotto2.subList(0, 3));
	}
}