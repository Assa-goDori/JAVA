package chap8;

class Parent3 {
	int x= 10;
	void method() {
		System.out.println("Parent �޼���");
	}
}

class Child3 extends Parent3 {
	int x = 20;
	void method() {
		int x = 30;
		System.out.println("Child3 �޼���");
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
		System.out.println("super.x= " + super.x);
	}
}
public class InstanceOfEx1 {
	public static void main(String[] args) {
		Parent3 p = new Parent3();		// new Child3()�ΰ�� if�� 2�� ����
		if(p instanceof Child3) {
			System.out.println("p �������� ��ü�� Child3 ��ü��");
			Child3 c = (Child3)p;
			System.out.println(c.x);
			c.method();
		}
		if(p instanceof Parent3) {
			System.out.println("p �������� ��ü�� Parent3 ��ü��");
			System.out.println(p.x);
			p.method();
		}
		if(p instanceof Object) {
			System.out.println("p �������� ��ü�� Object ��ü��");
			Object o = p;
//			System.out.println(o.x);	//error : x����� Object�� ����� �ƴϴ�.
//			o.method();					//error : method()����� Object�� ����� �ƴϴ�.
		}
	}
}