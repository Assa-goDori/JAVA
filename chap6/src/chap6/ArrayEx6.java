package chap6;
/*
 * Command ���ο��� �Ķ���� �ޱ�
 */
public class ArrayEx6 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Command ���ο� �Ķ���͸� �Է��ϼ���.");
			System.out.println("java chap6.ArrayEx6 ȫ�浿 ���");
			return;		// ���� �޼��� ����
		}
		for(int i = 0; i<args.length; i++) {
			System.out.println("args[" + i + "] = " + args[i]);
		}
		
	}
}