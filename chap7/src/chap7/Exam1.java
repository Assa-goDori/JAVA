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
		System.out.println("면적 : " + (r1.width*r1.height));
		//배열을 이용하여 사각형 객체를 3개를 생성하기
		//모든 사각형의 넓이 합을 출력하기
		Rectangle[] rArr = new Rectangle[3];
		int sum = 0;
		for(int i = 0; i<rArr.length; i++) {
			rArr[i] = new Rectangle();
			rArr[i].width = 10;
			rArr[i].height = 5;
			sum += (rArr[i].width*rArr[i].height);
		}
		System.out.println("3개의 삼각형 넓이의 합 : " + sum);
	}
}
