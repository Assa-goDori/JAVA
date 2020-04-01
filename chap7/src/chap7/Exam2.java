package chap7;
/*
 * Rectangle2 Ŭ���� �����ϱ�
 * 	������� : width, height, serialNo(�簢����ȣ), sno(�簢�� ��ȣ�� �����ϱ� ���� ���� ����)
 * 	����޼���
 * 		int area() : ������ ���ؼ� ����
 * 		int length() : �ѷ��� ���ؼ� ����
 * 		public String toString() : �簢���� ����, ����, �簢����ȣ, ������ �簢�� ������ ���ڿ��� ����
 */
class Rectangle2 {
	int width;
	int height;
	int serialNo;
	static int sno;
	int area() {
		return width*height;
	}
	
	int length() {
		return 2*(width+height);
	}
	
	public String toString() {
		return serialNo + "/" + sno + " �簢��: (" + width + ", " + height + ")"
				+ " ���� : " + area() + ", �ѷ� : " + length();
	}
}
/*
 * ���� Ŭ���� �����ϱ�
 * 1.1���簢�� : ����(10), ����(20)
 * 2.2���簢�� : ����(15), ����(25)
 * 3.3���簢�� : ����(20), ����(30)
 * 
 * ��� �簢���� ������ ����ϰ�, ��ü ������ �հ� �ѷ��� �� ����ϱ�
 * [���]
 * 1 /3 �簢�� : (10, 20) ���� : 200, �ѷ� : 60
 * 2 /3 �簢�� : (15, 20) ���� : 375, �ѷ� : 80
 * 3 /3 �簢�� : (20, 30) ���� : 600, �ѷ� : 100
 * 
 * ��ü �簢���� ������ �� : 1175
 * ��ü �簢���� �ѷ��� �� : 240
 */
public class Exam2 {
	public static void main(String[] args) {
//		Rectangle2 rec1 = new Rectangle2();
//		rec1.width = 10;
//		rec1.height = 20;
//		rec1.serialNo = ++Rectangle2.sno;
//		
//		Rectangle2 rec2 = new Rectangle2();
//		rec2.width = 15;
//		rec2.height =25;
//		rec2.serialNo = ++Rectangle2.sno;
//		
//		Rectangle2 rec3 = new Rectangle2();
//		rec3.width = 20;
//		rec3.height = 30;
//		rec3.serialNo = ++Rectangle2.sno;
//		
//		System.out.println(rec1);
//		System.out.println(rec2);
//		System.out.println(rec3);
//		System.out.println("��ü �簢���� ������ �� : " + (rec1.area() + rec2.area() + rec3.area()));
//		System.out.println("��ü �簢���� �ѷ��� �� : " + (rec1.length() + rec2.length() + rec3.length()));
		
		Rectangle2 arr[] = new Rectangle2[3];
		int totarea = 0, totlength = 0;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = new Rectangle2();
			arr[i].width = i*5+10;
			arr[i].height = i*5+20;
			arr[i].serialNo = ++Rectangle2.sno;
			totarea += arr[i].area();
			totlength += arr[i].length();
		}
		for(Rectangle2 r : arr) {
			System.out.println(r);
		}
		System.out.println("��ü �簢�� ������ �� : " + totarea);
		System.out.println("��ü �簢�� �ѷ��� �� : " + totlength);
	}
}