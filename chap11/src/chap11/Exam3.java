package chap11;
class UnsupportFunctionException extends RuntimeException {
	private final int ERR_CODE;
	UnsupportFunctionException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}	
	public int getErrCode() {
		return ERR_CODE;
	}
	@Override
	public String getMessage() {
		return super.getMessage() + " ERR_CODE : " + getErrCode();
	}
}
public class Exam3 {
	public static void main(String[] args) {
		
		try {
			throw new UnsupportFunctionException("지원하지 않는 기능입니다.", 200);
		} catch(UnsupportFunctionException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrCode());
		}
//		throw new UnsupportFunctionException("지원하지 않는 기능입니다.", 200);		//RuntimeException을 상속 받아서 예외처리를 안해도 컴파일 에러가 발생하지 않는다.
	}
}