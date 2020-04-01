package chap18;

import java.util.function.IntBinaryOperator;

/*
 * Operator 인터페이스
 *   apply 계열의 추상 메서드 소유.
 *   Function 인터페이스의 하위 인터페이스임.
 *   매개변수도 있고, 리턴값도 존재함.
 *   매개변수들을 연산한 값을 리턴.
 */
public class LambdaEx9 {
	private static Student[] list = {
			new Student("홍길동",90,80,"경영"),
			new Student("김삿갓",95,70,"컴공"),
			new Student("이몽룡",85,75,"통계"),
	};
	public static void main(String[] args) {
		System.out.print("최대 수학 점수 : ");
		int max = maxOrMinMath((a,b) -> {
			if(a>=b) return a;
			else return b;
		});
		System.out.println(max);
		
		System.out.print("최소 수학 점수 : ");
		System.out.println(maxOrMinMath((a,b)->(a>b)?b:a));
		
		System.out.print("최대 영어 점수 : ");
		int max2 = maxOrMinEng((a,b) -> {
			if(a>=b) return a;
			else return b;
		});
		System.out.println(max2);
		
		System.out.print("최소 영어 점수 : ");
		System.out.println(maxOrMinEng((a,b)->(a>b)?b:a));
	}
	
	private static int maxOrMinEng(IntBinaryOperator op) {
		int result = list[0].getEng();
		for(Student s : list) {
			result = op.applyAsInt(result, s.getEng());
		}
		return result;
	}
	
	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}
		return result;
	}
}