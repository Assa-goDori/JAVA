package chap7;
/*
 * 지역변수 예제
 * 	지역 변수 :
 * 		1. 메서드 내부에 선언된 변수
 * 		2. 매개변수도 지역변수임.
 * 		3. 반드시 초기화 필요
 * 
 *  num, b, grade, score, args(매개 변수도 지역변수임, 매개 변수는 호출하는 순간 초기화가 됨)
 */
public class LocalValEx {
	public static void main(String[] args) {
		int num;		// else  num = 200; 이 없는 경우 num이 초기화가 안되는 경우가 생기므로 에러 발생.
		boolean b = true;
		if(b) {
			num = 100;
		} else {
			num = 200;
		}
		System.out.println(num);
		String grade;				//default : grade = "F"가 없는경우 grade값이 초기화가 되지 않아 에러 발생.
		int score = 80;
		switch(score/10) {
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F";
		}
		System.out.println("학점 : " + grade);
	}
}
