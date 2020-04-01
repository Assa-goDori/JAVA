package chap5;

/*
 * switch 구문의 조건값으로 사용가능한 자료형
 * 	=> byte, short, int, char, String
 * 
 * 조건문 : if, switch
 * 	모든 switch 구문은 if 구문으로 변경 가능함.
 * 	모든 if 구문을 switch 구문으로 변경할 수 없다.
 */

public class SwitchEx2 {
	public static void main(String[] args) {
		int value = 1;
		switch(value) {
		case 1 : System.out.println(value); break;

		case 2 : System.out.println(value); break;
		}
	}

}
