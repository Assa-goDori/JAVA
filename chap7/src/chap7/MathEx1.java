package chap7;
/*
 * �޼��� ����
 * [����������] ����Ÿ�� �޼����(�Ű����� ���) => �����
 * {
 * 		���ڵ�;						=> ������
 * }
 * 
 * ����Ÿ�� : �޼��� ���� �� ȣ���� �޼���� ���޵Ǵ� ���� �ڷ���
 * �Ű����� : �޼��带 ȣ��� ���޵Ǵ� ���� �ڷ����� ������ ������
 * 			�޼��� ȣ��� �������� �ʱ�ȭ ��
 * 			�Ű������� �ʿ� ���� ��� ()�� ǥ����
 * return : �޼��带 ����
 * 			����Ÿ���� void�� ��� ���� ����
 * 			����Ÿ���� void�� �ƴ� ��� return ��; �� �ݵ�� ���ԵǾ�� ��
 * 			�� �� ���� �ڷ����� ����Ÿ�԰� ���ų� �ڵ�����ȯ�� ������ ���̾�� ��
 */
class Math1 {
	int add1(int a, int b)		//�����
	{
		return a+b;				//������
	}
	long add2(int a, int b) {return a+b;}
	double add3(int a, int b) {return a+b;}
}
public class MathEx1 {
	public static void main(String[] args) {
		Math1 m1 = new Math1();
		int a1 = m1.add1(10, 20);
		System.out.println(a1);
		long a2 = m1.add2(10, 20);
		System.out.println(a2);
		double a3 = m1.add3(10, 20);
		System.out.println(a3);
	}
}