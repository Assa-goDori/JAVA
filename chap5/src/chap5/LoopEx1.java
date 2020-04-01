package chap5;

/* 
* 반복문 예제
* 1. for		:	조건식 판별 후 문장 실행 후 증감식 적용 후 다시 조건식
* 	for(초기값;조건식;증감식) {
* 		문장;
* 	}
* 2. while		:	조건식 판별 후 문장 실행
* 	while(조건식) {
* 		문장;
* 	}
* 3. do while	:	무조건 문장을 먼저 실행하고 조건식 판별
* 	do {
* 		문장;
* 	}while(조건식)
*/

public class LoopEx1 {
	public static void main(String[] args) {
		System.out.println("for 구문으로 1 ~ 5까지 출력하기");
		for(int i=1; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		System.out.println("while 구문으로 1 ~ 5까지 출력하기");
		int i = 1;
		while(i<=5) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		
		System.out.println("do while 구문으로 1 ~ 5까지 출력하기");
		i = 1;
		do {
			System.out.print(i);
			i++;
		} while(i<=5);
	}

}
