package chap11;
/*
 * 나만의 예외 클래스 만들기
 */
import java.util.Scanner;

class LoginFailException extends Exception {
	LoginFailException(String msg) {
		super(msg);
	}
}

public class ExceptionEx8 {
	public static void main(String[] args) {
		try {
			String id = "hong";
			String pw = "1234";
			Scanner scan = new Scanner(System.in);
			System.out.println("아이디를 입력하세요");
			String inputId = scan.nextLine();	// 한 줄 통째로 입력 받기
//			if(!id.equals(inputId)) {
//				throw new LoginFailException("아이디가 틀립니다.");
//			}
			System.out.println("비밀번호를 입력하세요");
			String inputPw = scan.nextLine();
			if(id.equals(inputId) && pw.equals(inputPw)) {
				System.out.println("로그인 성공");
			} else if (!id.equals(inputId)) {
				throw new LoginFailException("아이디가 틀립니다.");
			} else {
				throw new LoginFailException("비밀번호가 틀립니다.");
			}
		} catch(LoginFailException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}