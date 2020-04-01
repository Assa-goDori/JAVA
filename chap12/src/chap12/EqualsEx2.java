package chap12;
/*
 * Object Ŭ������ equals �޼���
 *     : ��ü�� ������ ���ϴµ� ���Ǵ� �޼��� => �������̵� �ʿ�
 *     
 *     == : ���� ��ü ���� �Ǵ�
 *     Object Ŭ������ equals �޼��� : �⺻������ ���� ��ü ���� �Ǵ��ϵ��� ������.
 *     => ����񱳸� ���� ����� ���ؼ� �������̵��� �ʿ���.
 */
class Equal2 {
	int value;
	Equal2(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Equal2) {
			Equal2 e = (Equal2)o;
			return value == e.value;
		} else {
			return false;
		}
	}
}
public class EqualsEx2 {
	public static void main(String[] args) {
		Equal2 e1 = new Equal2(10);
		Equal2 e2 = new Equal2(10);
		if(e1 == e2) System.out.println("e1�� e2�� ���� ��ü��");
		else System.out.println("e1�� e2�� �ٸ� ��ü��");
		if(e1.equals(e2)) System.out.println("e1�� e2�� ���� ������ ��ü��");
		else System.out.println("e1�� e2�� �ٸ� ������ ��ü��");
//		e2 = e1;
		System.out.println("e1 ��ü�� �ؽ� �ڵ� �� : " + e1.hashCode());
		System.out.println("e2 ��ü�� �ؽ� �ڵ� �� : " + e2.hashCode());
		String str1 = new String("abc");
		String str2 = new String("abc");
		if(str1 == str2) System.out.println("str1 == str2");
		else System.out.println("str1 != str2");
		if(str1.equals(str2)) System.out.println("str.equals(str2)");		//String Ŭ�������� equals �޼��� �������̵���.
		else System.out.println("!str.equals(str2)");
		//�������� ���� ��ü���� �Ǵ��ϱ� ���� �������̵� ��.
		System.out.println("str1 ��ü�� �ؽ� �ڵ� �� : " + str1.hashCode());
		System.out.println("str2 ��ü�� �ؽ� �ڵ� �� : " + str2.hashCode());
	}
}