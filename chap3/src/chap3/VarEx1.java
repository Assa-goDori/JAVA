package chap3;
/*
* 한줄 주석 : // 이후
* 여러줄 주석 : /* ~ * / 까지 
* 주석이란 : 컴파일 문장에서 제외되는 영역
		   자바문법과 관련이 없는 부분.

  1. 자바 소스는 대소문자 구분함.
  2. public class VarEx1 => 파일의 이름은 반드시 VarEx1.java 이여야 함.
         파일의 이름과 public class 의 이름이 같아야 함.
     => 하나의 파일에는 하나의 public class만 존재하여야 함.
  3. 자바 컴파일러 : javac.exe
	 => 자바소스를 .class 파일(바이트 코드)로 변한하여 저장함.
  4. 자바 인터프리터 : java.exe
	 => 바이트코드를 실행.
*/

public class VarEx1 {

	public static void main(String[] args) {
		// 변수의 선언 : 변수를 사용하기전에 반드시 선언이 필요함. 메모리 할당. 할당의 크기는 자료형으로 결졍.
		int num;
		// 변수의 초기화
		num = 100;
		System.out.println(num);
		// 변수의 선언과 초기화
		byte b1 = -22;  // 1byte : -128 ~ 127 까지
		short s1 = -220; // 
		int i1 = 100;
		long l1 = 1000;
		b1 = 100;
		System.out.println(b1);
		b1 = (byte)300;
		System.out.println(b1); //44 값이 잘림 111 로 저장
		float f1 = 1.0f;
		double d1 = 1.0;
	}

}

/*
자료형
	기본형 : 8가지
 		논리형 : boolean(1byte)
 		문자형 : char(2byte)
 		정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
 		실수형 : float(4byte), double(8byte)
 	참조형(객체)
 		배열
 		클래스
 		인터페이스

형변환 :
	1. 기본형과 참조형은 형변환이 안됨. (단, Wrapper 클래스는 예외)
	2. boolean을 제외한 7가지는 서로 형변환이 가능함.
	3. 작은 자료형에서 큰 자료형으로 형변환시 형변환 연산자 생략 가능 : 자동 형변환
	4. 큰 자료형에서 작은 자료형으로 형변환시 형변환 연산자 생략 불가 : 명시적 형변환
	
실수형 리터널의 기본형은 double임. float형 리터널로 표시하기 위해서는 f 접미사 필요.
	F, f : float형 리터널 표시
	D, d : double형 리터널 표시
	L, l : long형 리터널 표시
*/
