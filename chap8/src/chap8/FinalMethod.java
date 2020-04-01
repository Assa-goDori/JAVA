package chap8;
/*
 * final 변경 불가
 * final method : 재정의 불가. 오버라이딩 불가 메서드
 * abstract <=> final 반대개념의 의미
 * 		abstract : 반드시 오버라이딩 해야됨
 * 		final : 절대로 오버라이딩 할 수 없음
 */
public class FinalMethod {
	protected final void finalMethod() {
		System.out.println("finalMethod 오버라이딩 불가 메서드");
	}
}

class SubMethod extends FinalMethod {
//	@Override
//	protected void finalMethod() {
//		System.out.println("finalMethod 오버라이딩 불가 메서드");
//	}
}
