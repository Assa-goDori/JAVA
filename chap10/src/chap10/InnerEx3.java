package chap10;
/*
 * ���� Ŭ���� ��ü���� ���Ǵ� this
 *     => ���� �ܺ� Ŭ������ ����� ���� �Ұ�(�ܺ�Ŭ������.this.������ ���� ���� ����)
 */
class Outer3 {
	int iv = 10;
	int iv2 = 20; 
	class InstanceInner {
		int iv = 100;
		void method1() {
			int iv = 300;
			System.out.println("iv = " + iv);			//300, �޼��� ���� �������� ����
			System.out.println("iv2 = " + iv2);			//20, �ܺ�Ŭ���� ���� �ν��Ͻ� ��� ����
			System.out.println("this.iv = " + this.iv);	//100, ����Ŭ���� ��ü ���� �ν��Ͻ���� ����
			// �ܺ� Ŭ���� iv ��� : Outer3.this => �ܺ�Ŭ������ ��ü �ǹ�
			System.out.println("Outer3.this.iv = " + Outer3.this.iv);
		}
	}
	
	static class StaticInner {
		int iv = 100;
		void method1() {
			int iv = 300;
			System.out.println("iv = " + iv);			
			System.out.println("iv2 = " + new Outer3().iv2);	//�ν��Ͻ� ��� ���� �� ��üȭ �ʿ�		
			System.out.println("this.iv = " + this.iv);
			System.out.println("Outer3().iv = " + new Outer3().iv);
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner oi = out.new InstanceInner();
		oi.method1();
		Outer3.StaticInner os = new Outer3.StaticInner();
		os.method1();
	}
}