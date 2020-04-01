package chap5;

/* 
* �ݺ��� ����
* 1. for		:	���ǽ� �Ǻ� �� ���� ���� �� ������ ���� �� �ٽ� ���ǽ�
* 	for(�ʱⰪ;���ǽ�;������) {
* 		����;
* 	}
* 2. while		:	���ǽ� �Ǻ� �� ���� ����
* 	while(���ǽ�) {
* 		����;
* 	}
* 3. do while	:	������ ������ ���� �����ϰ� ���ǽ� �Ǻ�
* 	do {
* 		����;
* 	}while(���ǽ�)
*/

public class LoopEx1 {
	public static void main(String[] args) {
		System.out.println("for �������� 1 ~ 5���� ����ϱ�");
		for(int i=1; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		System.out.println("while �������� 1 ~ 5���� ����ϱ�");
		int i = 1;
		while(i<=5) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		
		System.out.println("do while �������� 1 ~ 5���� ����ϱ�");
		i = 1;
		do {
			System.out.print(i);
			i++;
		} while(i<=5);
	}

}
