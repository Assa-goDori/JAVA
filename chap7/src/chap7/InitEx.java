package chap7;
/*
 * �ʱ�ȭ �� ����
 * 	static �ʱ�ȭ �� :
 * 		�ֿ� ��� : Ŭ���� ������ �ʱ�ȭ
 * 		���� �ñ� : Ŭ���� ������ �ε� �� �� �ѹ��� ����
 * 	�ν��Ͻ� �ʱ�ȭ �� :
 * 		�ֿ� ��� : �ν��Ͻ� ������ �ʱ�ȭ, �����ڿ� ����� ��ħ
 * 		���� �ñ� : ��ü ������, ������ ���� ���� ����
 */
public class InitEx {
	static int cv;
	int iv;
	InitEx() {
		System.out.println("5. ������ ȣ��");
	}
	static {		// static �ʱ�ȭ ��
		cv = (int)(Math.random()*100);
		System.out.println("1.Static �ʱ�ȭ �� cv =" + cv);
	}
	{				// �ν��Ͻ� �ʱ�ȭ ��
		iv = (int)(Math.random()*100);
		System.out.println("4. �ν��Ͻ� �ʱ�ȭ �� iv = " + iv);
	}
	public static void main(String[] args) {
		System.out.println("2. main �޼��� ����");
		System.out.println("3. main init1 ��ü ����");
		InitEx init1 = new InitEx();
		System.out.println("3. main init2 ��ü ����");
		InitEx init2 = new InitEx();
	}
}
