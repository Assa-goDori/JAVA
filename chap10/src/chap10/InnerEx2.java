package chap10;
/*
 * �ܺ� Ŭ������ ���� Ŭ������ ��ȣ ȣ��
 */
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner { 
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner {
//		int siv = new Outer2().outeriv;		//Ŭ���� ������� �ν��Ͻ� ��� ȣ��� ��üȭ �ʿ�
		static int scv = outercv;
	}
	static StaticInner cv = new StaticInner();
	InstanceInner iv = new InstanceInner();
	static InstanceInner cv2 = new Outer2().new InstanceInner();
	StaticInner iv2 = new StaticInner();
	
	void method(final int pv) {
//		pv++;
		int num=100;	// final int num = 100;
//		num++;
		class LocalInner { 
			int liv = outeriv;		// ���� ���� Ŭ�������� �ܺ� Ŭ������ private ��� ���� ����
			int liv2 = outercv;
			void method() {
				//���� ���� Ŭ�������� �ܺ� �޼����� �������� ����, �ش� ���������� ���ȭ�� �Ǿ�� ��.
				System.out.println("pv = " + pv);
				System.out.println("num = " + num);		// num++ ����� ����(����̾�� ��)
				System.out.println("liv = " + liv);
				System.out.println("outeriv = " + outeriv);
			}
		}
		LocalInner li = new LocalInner();
		li.method();
	}
}
public class InnerEx2 {
	public static void main(String[] args) {
//		InstanceInner Ŭ���� ��üȭ �ϱ�
		Outer2.InstanceInner in = new Outer2().new InstanceInner();
		System.out.println("iiv = " + in.iiv);
		System.out.println("iiv2 = " + in.iiv2);
//		StaticInner Ŭ���� ��üȭ �ϱ�
		Outer2.StaticInner sn = new Outer2.StaticInner();
		System.out.println("scv = " + Outer2.StaticInner.scv);
//		method() ȣ���ϱ�
		new Outer2().method(100);
	}
}