package chap11;
// 예외 처리를 두번 하기.
public class ExceptionEx7 {
	public static void main(String[] args) throws InterruptedException {
		try {
			badmethod();
		} catch (Exception e) {
			System.out.println("main 에서 예외 처리");
			e.printStackTrace();
		}
		Thread.sleep(1000);		//1초 동안 대기, Thread 클래스 사용하기 위해선 반드시 예외처리 해야됨(RunTimeException 예외 아님)
		System.out.println("main 메서드 종료");
	}
	private static void badmethod() throws Exception {
		try {
			throw new Exception("예외 강제 발생");
		} catch(Exception e) {
			System.out.println("badmethod에서 예외 처리");
			e.printStackTrace();
			throw e;
		}
	}
}