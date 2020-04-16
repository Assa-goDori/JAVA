package chap9;
/*
 * �������̽� ����
 * 
 * �������̽�
 *     1. �������̽��� ����� ���, �߻�޼���, default �޼���, static �޼��常 �����ϴ�.
 *       ��� ���� : (public static final) �ڷ��� �����;
 *               int NUM = 100;
 *               public int NUM = 100;
 *               static int NUM = 100;
 *               final int NUM = 100;
 *       �߻� �޼��� ���� : (public abstract) ����Ÿ�� �޼����();
 *               int getA();
 *               abstract int getA();
 *               public int getA();
 *       defualt �޼��� => jdk 8.0 ���ĺ��� ��밡��, �����ΰ� ������.
 *                  : public default ����Ÿ�� �޼����() { ������ }
 *       static �޼��� => jdk 8.0 ���ĺ��� ��밡��, �����ΰ� ������.
 *                  : public static ����Ÿ�� �޼����() { ������ }
 *     2. �������̽��� ����� ���� ������ : public
 *     3. ��üȭ �Ұ� => ���� Ŭ������ ��üȭ�� ���ؼ� ��üȭ ��.
 *     4. Ŭ������ �������̽����� ����(implements)���� ǥ���Ѵ�. -> ���� ������ ���� 
 *     5. �������̽����� ����� �����ϴ�. -> ���� ����� ����         
 */
interface Printerable {
	int INK = 100;	// ���  = (public static final) int INK = 100;
	void print();	// (public abstract) void print();
}
interface Scannerable { 
	void scan();
}
interface Faxable {
	String FAX_NO = "010-12345";
	void send(String tel);
	void receive(String tel);
}
interface Complexerable extends Printerable, Scannerable, Faxable {}

// ����Ŭ���� : �������̽��� ������ Ŭ����.
class Complexer implements Complexerable {
	int ink;
	Complexer() {
		this.ink = INK;
	}
	@Override
	public void print() {
		System.out.println("���̿� ����մϴ�. ���� ��ũ�� : " + --ink);
	}

	@Override
	public void scan() {
		System.out.println("�̹����� ��ĵ �մϴ�.");
	}

	@Override
	public void send(String tel) {
		System.out.println(FAX_NO + "���� " + tel + "��ȣ�� FAX�� �����մϴ�.");
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel + "���� " + FAX_NO + "��ȣ�� FAX�� �޾ҽ��ϴ�.");
	}
	
}
public class ComplexerEx1 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println("�⺻ ��ũ�� : " + Printerable.INK);
		System.out.println("�⺻ ��ũ�� : " + Complexerable.INK);
		System.out.println("FAX ��ȣ : " + Complexerable.FAX_NO);
		System.out.println("FAX ��ȣ : " + Faxable.FAX_NO);
		System.out.println("FAX ��ȣ : " + Complexer.FAX_NO);
		com.print();
		com.scan();
		com.receive("02-5678");
		com.send("02-5678");
		if(com instanceof Complexer) {
			System.out.println("com ��ü�� Complexer ��ü��");
		}
		if(com instanceof Complexerable) {
			System.out.println("com ��ü�� Complexerable ��ü��");
		}
		if(com instanceof Printerable) {
			System.out.println("com ��ü�� Printerable ��ü��");
			Printerable p = (Printerable)com; // �ڵ�����ȯ ��
			p.print();
//			p.scan(); // error, Printerable ����� �ƴ�
		}
		if(com instanceof Scannerable) {
			System.out.println("com ��ü�� Scannerable ��ü��");
			Scannerable s = com;
			s.scan();
//			s.print(); // error, Scannernable ����� �ƴ�
		}
		if(com instanceof Faxable) {
			System.out.println("com ��ü�� Faxable ��ü��");
			Faxable f = com;
			System.out.println(Faxable.FAX_NO);
			f.send("01234");
			f.receive("1212");
		}
	}
}