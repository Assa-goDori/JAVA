package chap18;

import java.util.function.IntBinaryOperator;

/*
 * Operator �������̽�
 *   apply �迭�� �߻� �޼��� ����.
 *   Function �������̽��� ���� �������̽���.
 *   �Ű������� �ְ�, ���ϰ��� ������.
 *   �Ű��������� ������ ���� ����.
 */
public class LambdaEx9 {
	private static Student[] list = {
			new Student("ȫ�浿",90,80,"�濵"),
			new Student("���",95,70,"�İ�"),
			new Student("�̸���",85,75,"���"),
	};
	public static void main(String[] args) {
		System.out.print("�ִ� ���� ���� : ");
		int max = maxOrMinMath((a,b) -> {
			if(a>=b) return a;
			else return b;
		});
		System.out.println(max);
		
		System.out.print("�ּ� ���� ���� : ");
		System.out.println(maxOrMinMath((a,b)->(a>b)?b:a));
		
		System.out.print("�ִ� ���� ���� : ");
		int max2 = maxOrMinEng((a,b) -> {
			if(a>=b) return a;
			else return b;
		});
		System.out.println(max2);
		
		System.out.print("�ּ� ���� ���� : ");
		System.out.println(maxOrMinEng((a,b)->(a>b)?b:a));
	}
	
	private static int maxOrMinEng(IntBinaryOperator op) {
		int result = list[0].getEng();
		for(Student s : list) {
			result = op.applyAsInt(result, s.getEng());
		}
		return result;
	}
	
	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}
		return result;
	}
}