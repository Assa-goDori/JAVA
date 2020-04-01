package chap7;
/*
 * Rectangle2 클래스 구현하기
 * 	멤버변수 : width, height, serialNo(사각형번호), sno(사각형 번호를 생성하기 위한 공통 변수)
 * 	멤버메서드
 * 		int area() : 면적을 구해서 리턴
 * 		int length() : 둘레를 구해서 리턴
 * 		public String toString() : 사각형의 가로, 세로, 사각형번호, 생성된 사각형 갯수를 문자열로 리턴
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
		return serialNo + "/" + sno + " 사각형: (" + width + ", " + height + ")"
				+ " 면적 : " + area() + ", 둘레 : " + length();
	}
}
/*
 * 구동 클래서 구현하기
 * 1.1번사각형 : 가로(10), 세로(20)
 * 2.2번사각형 : 가로(15), 세로(25)
 * 3.3번사각형 : 가로(20), 세로(30)
 * 
 * 모든 사각형의 정보를 출력하고, 전체 면적의 합과 둘레의 합 출력하기
 * [결과]
 * 1 /3 사각형 : (10, 20) 면적 : 200, 둘레 : 60
 * 2 /3 사각형 : (15, 20) 면적 : 375, 둘레 : 80
 * 3 /3 사각형 : (20, 30) 면적 : 600, 둘레 : 100
 * 
 * 전체 사각형의 면적의 합 : 1175
 * 전체 사각형의 둘레의 합 : 240
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
//		System.out.println("전체 사각형의 면적의 합 : " + (rec1.area() + rec2.area() + rec3.area()));
//		System.out.println("전체 사각형의 둘레의 합 : " + (rec1.length() + rec2.length() + rec3.length()));
		
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
		System.out.println("전체 사각형 면적의 합 : " + totarea);
		System.out.println("전체 사각형 둘레의 합 : " + totlength);
	}
}