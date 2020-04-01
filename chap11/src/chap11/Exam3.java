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
			throw new UnsupportFunctionException("�������� �ʴ� ����Դϴ�.", 200);
		} catch(UnsupportFunctionException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrCode());
		}
//		throw new UnsupportFunctionException("�������� �ʴ� ����Դϴ�.", 200);		//RuntimeException�� ��� �޾Ƽ� ����ó���� ���ص� ������ ������ �߻����� �ʴ´�.
	}
}