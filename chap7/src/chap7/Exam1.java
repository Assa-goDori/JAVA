package chap7;

class Rectangle {
	int width;
	int height;
}

public class Exam1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 5;
		System.out.println("���� : " + (r1.width*r1.height));
		//�迭�� �̿��Ͽ� �簢�� ��ü�� 3���� �����ϱ�
		//��� �簢���� ���� ���� ����ϱ�
		Rectangle[] rArr = new Rectangle[3];
		int sum = 0;
		for(int i = 0; i<rArr.length; i++) {
			rArr[i] = new Rectangle();
			rArr[i].width = 10;
			rArr[i].height = 5;
			sum += (rArr[i].width*rArr[i].height);
		}
		System.out.println("3���� �ﰢ�� ������ �� : " + sum);
	}
}
