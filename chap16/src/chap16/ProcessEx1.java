package chap16;
/*
 * ��Ƽ���μ��� ����
 */
public class ProcessEx1 {
	public static void main(String[] args) {
		try {
			//Runtime.getRuntime() : ���μ����� ���� ������ OS���� ����.
			Process p1 = Runtime.getRuntime().exec("mspaint.exe");
			Process p2 = Runtime.getRuntime().exec("notepad.exe");
			p1.waitFor();	// p1 ���μ����� ������ �� ���� main ���.
			p2.destroy();	// p1 ���� ����� p2(�޸���) ���� ����
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}