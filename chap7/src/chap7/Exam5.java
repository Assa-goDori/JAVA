package chap7;
/*
 * 
 */
class Rectangle5 {
	int width;
	int height;
	int num;
	static int rno;
	Rectangle5(int width, int height) {
		this.width = width;
		this.height = height;
		num = ++rno;
	}
	
	Rectangle5(int width) {
		this(width, 1);
	}
	
	Rectangle5() {
		this(1, 1);
	}
	
	public String toString() {
		return num + "���簢��:(" + width + "," + height + ") ����:" + (width*height) +
				", �ѷ�:" + (2*(width+height)) + ", " + ((width==height)?"���簢��":"���簢��");
	}
}
public class Exam5 {
	public static void main(String[] args) {
		Rectangle5 r1 = new Rectangle5();
		Rectangle5 r2 = new Rectangle5(10);
		Rectangle5 r3 = new Rectangle5(10, 10);
		System.out.println(r1);		//1���簢��:(1,1) ����:1, �ѷ�:4, ���簢��
		System.out.println(r2);		//2���簢��:(10,1) ����:10, �ѷ�:22, ���簢��
		System.out.println(r3);		//3���簢��:(10,10) ����:100, �ѷ�:40, ���簢��
	}
}