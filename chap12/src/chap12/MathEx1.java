package chap12;

public class MathEx1 {
	public static void main(String[] args) {
		//abs(������ or ������) : ���밪
		System.out.println("Math.abs(5) = " + Math.abs(5));
		System.out.println("Math.abs(-5) = " + Math.abs(-5));
		System.out.println("Math.abs(3.14) = " + Math.abs(3.14));
		System.out.println("Math.abs(-3.14) = " + Math.abs(-3.14));
		//ceil() : ���� �� ���� ū �ٻ�����
		System.out.println("Math.ceil(5.4) = " + Math.ceil(5.4));
		System.out.println("Math.ceil(-5.4) = " + Math.ceil(-5.4));
		//floor() : ���� �� ���� ���� �ٻ� ����
		System.out.println("Math.floor(5.4) = " + Math.floor(5.4));
		System.out.println("Math.floor(-5.4) = " + Math.floor(-5.4));
		//rint() : ���� ���̶� ���� ����� �ٻ� ����
		System.out.println("Math.rint(5.4) = " + Math.rint(5.4));
		System.out.println("Math.rint(-5.4) = " + Math.rint(-5.4));
		//min() : �ּҰ�
		System.out.println("Math.min(5, 4) = " + Math.min(5, 4));
		System.out.println("Math.min(5.4, 5.3) = " + Math.min(5.4, 5.3));
		//max() : �ִ밪
		System.out.println("Math.max(5, 4) = " + Math.max(5, 4));
		System.out.println("Math.max(5.4, 5.3) = " + Math.max(5.4, 5.3));
		//round() : �ݿø� ��
		System.out.println("Math.round(5.4) = " + Math.round(5.4));
		System.out.println("Math.round(5.5) = " + Math.round(5.5));
		//random() : 0���ٴ� ũ�� 1.0���ٴ� ���� ������ ������ �� ����
		System.out.println("Math.random() = " + Math.random());
		
		System.out.println();
		//�ﰢ�Լ� : ������ ���� ������ ó��.
		System.out.println("Math.sin(Math.PI/2) = " + Math.sin(Math.PI/2));
		System.out.println("Math.cos(Math.toRadians(60)) = " + Math.cos(Math.toRadians(60)));
		System.out.println("Math.tan(Math.PI/4) = " + Math.tan(Math.PI/4));
		System.out.println("Math.toDegrees(Math.PI/2) = " + Math.toDegrees(Math.PI/2));
		//Log�Լ�
		System.out.println("Math.log(Math.E) = " + Math.log(Math.E));
		//������
		System.out.println("Math.sqrt(25) = " + Math.sqrt(25));
		//����
		System.out.println("Math.pow(5,4) = " + Math.pow(5, 4));
		
	}
}