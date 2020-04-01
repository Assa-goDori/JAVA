package chap8;
/*
 * final ���� : ���� �Ұ� ����. ���
 * 
 * final ������ �����ڿ��� �ѹ��� ���� ���� �� �� �ִ�. => ��ü ���� �ٸ� ��� ���� ������ �ֵ��� �ϱ� ����
 * => ��, ����� �ʱ�ȭ�� �ȵ� ��츸 ������. ����� �ʱ�ȭ�� �� ���� �����ڿ����� �ʱ�ȭ �ȵ� ex) final int x = 10;
 */
class FinalValue {
	final int NUM;
	FinalValue(int num) {
		NUM = num;
	}
	public int getNUM() {
		return NUM;
	}
}
public class FinalValueEx1 {
	public static void main(String[] args) {
		FinalValue f1 = new FinalValue(10);
		System.out.println(f1.getNUM());
//		f1.NUM = 100;	// ����� ���� �Ұ�.
		FinalValue f2 = new FinalValue(20);
		System.out.println(f2.getNUM());
	}
}