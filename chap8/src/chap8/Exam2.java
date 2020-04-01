package chap8;
/*
 * �ڼ�Ÿ���� ��ü�� �θ�Ÿ���� ���������� ������ �����ϴ�.
 * �θ�Ÿ���� ��ü�� �ڼ�Ÿ���� ���������� ������ RunTime(����) ������ �߻��Ѵ�.
 *    => ClassCastException ���ܰ� �߻���.
 */
class Parent2 {
	int x = 10;
	void method() {
		System.out.println("Parent2�� �޼���");
	}
}
class Child2 extends Parent2 {
	int x = 20;
	@Override
	void method() {
		System.out.println("Child2�� �޼���");
		System.out.println(this.x); //20
		System.out.println(super.x); //10
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Child2 c;
		Parent2 p = new Child2();
		c = (Child2)p;
		System.out.println(p.x);  //10
		System.out.println(c.x);  //20
		p.method();	//Child2�� �޼���
		c.method();	//Child2�� �޼���
	}
}