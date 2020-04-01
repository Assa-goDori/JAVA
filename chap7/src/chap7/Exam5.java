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
		return num + "번사각형:(" + width + "," + height + ") 면적:" + (width*height) +
				", 둘레:" + (2*(width+height)) + ", " + ((width==height)?"정사각형":"직사각형");
	}
}
public class Exam5 {
	public static void main(String[] args) {
		Rectangle5 r1 = new Rectangle5();
		Rectangle5 r2 = new Rectangle5(10);
		Rectangle5 r3 = new Rectangle5(10, 10);
		System.out.println(r1);		//1번사각형:(1,1) 면적:1, 둘레:4, 정사각형
		System.out.println(r2);		//2번사각형:(10,1) 면적:10, 둘레:22, 직사각형
		System.out.println(r3);		//3번사각형:(10,10) 면적:100, 둘레:40, 정사각형
	}
}