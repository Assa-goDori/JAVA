package chap11;
import java.util.Scanner;
/*
 * 화면에서 1부터 10까지의 숫자를 입력받아서 숫자만큼 *를 가로로 출력하기
 * 단, 99숫자가 입력되면 입력 종료
 * 입력값이 숫자가 아닌 경우, "숫자만 입력하세요" 메세지 출력하고, 다시 입력받도록 수정하기
 * 
 * 추가 : 입력된 숫자가 1~10 사이의 수가 아닌경우 InputMissMatchExcetpion
 *      1부터 10까지의 숫자만 입력하세요 내용 출력
 *      이후 다시 입력 받기
 */ 

class NumberMissMatchException extends Exception {
	NumberMissMatchException(String msg) {
		super(msg); 
	}
}

public class Exam1 {
	public static void main(String[] args) {
		System.out.println("1부터 10까지의 숫자를 입력하세요.(종료 : 99)");
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {			//try 내부에서 바깥에 선언된 변수들 접근 불가
				int input = scan.nextInt();
				if(input==99) { System.out.println("입력을 종료합니다."); break; }
				if(input>10) { throw new NumberMissMatchException("1부터 10까지의 숫자를 다시 입력하세요"); }
				System.out.print(input + " : ");
				for(int i = 0; i<input; i++) { System.out.print("*"); }
			} catch (NumberMissMatchException e) {
				System.out.println(e.getMessage());
				continue;
			} catch (Exception e) {
				System.out.println(scan.next() + "는 숫자가 아닙니다. 숫자만 입력하세요");
				continue;
			}
			System.out.println();
		}
	}
}