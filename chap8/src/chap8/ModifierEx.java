package chap8;

import chap8.test.Modifier2;

/*
 * ���� ������
 *     private < (default) < protected < public
 */

class Modifier {
	private int v1 = 100;
			int v2 = 200;
	protected int v3 = v1;
	public void method() {
		System.out.println("chap8.Modifier.method() �޼�����");
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
	}
}

class Modifier3 extends Modifier2 {
	public void method() {
//		System.out.println("v1 = " + v1);		// private ���� �ȵ�
//		System.out.println("v2 = " + v2);		// (default) ���� ��Ű���� �ƴϹǷ� ���� �ȵ�
		System.out.println("v3 = " + v3);		// protected �̹Ƿ� �ٸ� ��Ű������ ��Ӱ��Կ��� ���� ����
		System.out.println("v4 = " + v4);		// public ��� ���� ����
	}
}
public class ModifierEx {
	public static void main(String[] args) {
		Modifier m1 = new Modifier();
//		System.out.println(m1.v1);		// v1������ ���� �����ڰ� private �̹Ƿ� ���� �Ұ�
		System.out.println(m1.v2);
		System.out.println(m1.v3);
		m1.method();
		Modifier3 m3 = new Modifier3();
//		System.out.println("m3.v1 = " + m3.v1);		//���� Ŭ������ �ƴ϶� ���� �ȵ�
//		System.out.println("m3.v2 = " + m3.v2);		//��Ű���� �޶� ������ �ȵ�
//		System.out.println("m3.v3 = " + m3.v3);		//Modifier2�� ModifierEx�� ��Ӱ��谡 �ƴ϶� ���� �ȵ�
		System.out.println("m3.v4 = " + m3.v4);
	}
}