package chap3;
/*
 <-------- ����� ����ȯ(���� �Ұ���)
 byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
 		   char(2)
 									�ڵ� ����ȯ(���� ����) -------->
 	# �� char �� byte, short ���� ����ȯ�� ����� ����ȯ�̾�� ��.
 	# String Ŭ������ + �����ڸ� �̿��Ͽ� String���� ����ȯ�� ������
 		String = String + �⺻��
 */
public class VarEx2 {

	public static void main(String[] args) {
		byte b1 = 10; // = ���Կ�����, b1������ 10 ���� ����.
		byte b2 = 20;
		long l1 = 100, l2 = 200;
		long l3 = l1 + l2;
		char c1 = 'A';
		int i1 = c1; // �ڵ� ����ȯ, ����ȯ ������ ���� ����
		c1 = (char)i1; // ����� ����ȯ, ����ȯ ������ ���� �Ұ��� �ϹǷ� �������.
		System.out.println("b1= " + b1 + ", b2= " + b2);
		System.out.println("l1= " + l1 + ", l2 = " + l2 + ", l3 = " + l3);
		System.out.println("c1= " + c1 + ", i1= " + i1);
		System.out.println(c1);
		
		float f1 = l3; // �ڵ� ����ȯ   float���� ������ ��������� ������ ���������δ� float���� long������ ū �ڷ�����.
		l3 = (long)f1; // ����� ����ȯ
		b1 = 65;
		c1 = (char)b1; //����� ����ȯ. ����ȯ ������ �ݵ�� �Է�
		
		System.out.println("��ȣ : " + 1 + 2 + 3); // ��ȣ : 123   /  ��ȣ : 6 => System.out.println("��ȣ : " + (1 + 2 + 3));
		System.out.println(1 + 2 + 3 + "��"); // 6��
	}

}
