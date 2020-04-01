package chap12;

public class MathEx1 {
	public static void main(String[] args) {
		//abs(정수형 or 더블형) : 절대값
		System.out.println("Math.abs(5) = " + Math.abs(5));
		System.out.println("Math.abs(-5) = " + Math.abs(-5));
		System.out.println("Math.abs(3.14) = " + Math.abs(3.14));
		System.out.println("Math.abs(-3.14) = " + Math.abs(-3.14));
		//ceil() : 현재 값 보다 큰 근사정수
		System.out.println("Math.ceil(5.4) = " + Math.ceil(5.4));
		System.out.println("Math.ceil(-5.4) = " + Math.ceil(-5.4));
		//floor() : 현재 값 보다 작은 근사 정수
		System.out.println("Math.floor(5.4) = " + Math.floor(5.4));
		System.out.println("Math.floor(-5.4) = " + Math.floor(-5.4));
		//rint() : 현재 값이랑 가장 가까운 근사 정수
		System.out.println("Math.rint(5.4) = " + Math.rint(5.4));
		System.out.println("Math.rint(-5.4) = " + Math.rint(-5.4));
		//min() : 최소값
		System.out.println("Math.min(5, 4) = " + Math.min(5, 4));
		System.out.println("Math.min(5.4, 5.3) = " + Math.min(5.4, 5.3));
		//max() : 최대값
		System.out.println("Math.max(5, 4) = " + Math.max(5, 4));
		System.out.println("Math.max(5.4, 5.3) = " + Math.max(5.4, 5.3));
		//round() : 반올림 값
		System.out.println("Math.round(5.4) = " + Math.round(5.4));
		System.out.println("Math.round(5.5) = " + Math.round(5.5));
		//random() : 0보다는 크고 1.0보다는 작은 임의의 더블형 수 리턴
		System.out.println("Math.random() = " + Math.random());
		
		System.out.println();
		//삼각함수 : 각도는 라디안 단위로 처리.
		System.out.println("Math.sin(Math.PI/2) = " + Math.sin(Math.PI/2));
		System.out.println("Math.cos(Math.toRadians(60)) = " + Math.cos(Math.toRadians(60)));
		System.out.println("Math.tan(Math.PI/4) = " + Math.tan(Math.PI/4));
		System.out.println("Math.toDegrees(Math.PI/2) = " + Math.toDegrees(Math.PI/2));
		//Log함수
		System.out.println("Math.log(Math.E) = " + Math.log(Math.E));
		//제곱근
		System.out.println("Math.sqrt(25) = " + Math.sqrt(25));
		//제곱
		System.out.println("Math.pow(5,4) = " + Math.pow(5, 4));
		
	}
}