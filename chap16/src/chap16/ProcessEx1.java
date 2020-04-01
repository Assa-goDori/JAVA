package chap16;
/*
 * 멀티프로세스 예제
 */
public class ProcessEx1 {
	public static void main(String[] args) {
		try {
			//Runtime.getRuntime() : 프로세스의 실행 권한을 OS에서 얻음.
			Process p1 = Runtime.getRuntime().exec("mspaint.exe");
			Process p2 = Runtime.getRuntime().exec("notepad.exe");
			p1.waitFor();	// p1 프로세스가 종료할 때 까지 main 대기.
			p2.destroy();	// p1 강제 종료시 p2(메모장) 강제 종료
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}