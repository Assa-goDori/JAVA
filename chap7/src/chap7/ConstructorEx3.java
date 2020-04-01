package chap7;
/*
 * Exam2.java 의 Rectangle2 클래스를 생성자로 변경하기
 */
class Rectangle3 {
	int width;
	int height;
	int serialNo;
	static int sno;
	Rectangle3(int w, int h) {
		width = w;
		height=h;
		serialNo=++sno;
	}
	
	int area() {
		return width*height;
	}
	
	int length() {
		return 2*(width+height);
	}
	
	public String toString() {
		return serialNo + "/" + sno + " 사각형: (" + width + ", " + height + ")"
				+ " 면적 : " + area() + ", 둘레 : " + length();
	}
}
public class ConstructorEx3 {
	public static void main(String[] args) {
//		Rectangle3 rec1 = new Rectangle3(10, 20);
//		Rectangle3 rec2 = new Rectangle3(15, 25);
//		Rectangle3 rec3 = new Rectangle3(20, 30);
//		System.out.println(rec1);
//		System.out.println(rec2);
//		System.out.println(rec3);
//		System.out.println("전체 사각형의 면적의 합 : " + (rec1.area() + rec2.area() + rec3.area()));
//		System.out.println("전체 사각형의 둘레의 합 : " + (rec1.length() + rec2.length() + rec3.length()));
		
		Rectangle3 arr[] = new Rectangle3[3];
		int totarea = 0, totlength = 0;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = new Rectangle3(i*5+10, i*5+20);
			totarea += arr[i].area();
			totlength += arr[i].length();
		}
		for(Rectangle3 r : arr) {
			System.out.println(r);
		}
		System.out.println("전체 사각형 면적의 합 : " + totarea);
		System.out.println("전체 사각형 둘레의 합 : " + totlength);
	}
}