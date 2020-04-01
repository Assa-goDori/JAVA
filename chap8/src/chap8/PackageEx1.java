package chap8;

import chap8.test.Pack2;

/*
 * 패키지 예제
 * 
 * package
 *     클래스들의 모임.
 *     클래스의 이름은 패키지명을 포함한다.
 *     package 구문은 파일 처음에 한번만 설정이 가능함. => 하나의 파일에 있는 모든 클래스는 같은 패키지에 속한 클래스이다.
 *     패키지는 폴더로 구분한다.
 *     
 * import
 *     패키지명을 생략할 수 있도록 미리 사용될 클래스의 패키지명을 선언.
 *     
 * 클래스의 패키지명을 생략할 수 있는 경우
 *     1. 같은 패키지에 속한 클래스는 패키지명 생략 가능
 *     2. java.lang 패키지에 속한 클래스들은 패키지명 생략 가능
 *     3. import 구문으로 설정된 클래스는 패키지명 생략 가능
 */

class Pack1 {
	void method() {
		System.out.println("chap8.Pack1.method() 호출");
	}
}
public class PackageEx1 {
	public static void main(String[] args) {
		Pack1 p1 = new Pack1();
		p1.method();
		Pack2 p2 = new Pack2();
		p2.method();
	}
}