package chap12;
import java.util.Calendar;
import java.util.Scanner;

public class Exam7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���.");
		int inputYear = scan.nextInt();
		System.out.println("���� �Է��ϼ���.");
		int inputMonth = scan.nextInt();

		int day = 1;
		Calendar cal = Calendar.getInstance();
		cal.set(inputYear, inputMonth-1, 1);
		System.out.println(cal.get(Calendar.YEAR) + "�� " + (cal.get(Calendar.MONTH)+1) + "��");
		System.out.println("  ��    ��    ȭ    ��    ��    ��    �� ");

		int firstwk = cal.get(Calendar.DAY_OF_WEEK);
		int lastwk = cal.getActualMaximum(Calendar.DATE);

//		for(int i = 0; i<5; i++) {
//			for(int j = 1; j<8; j++) {
//				if(i==0 && j<firstwk) {
//					System.out.print("   ");
//				} else { 
//					System.out.printf(" %2d", day++);
//				}
//				if(day>cal.getMaximum(Calendar.DATE)) break;
//			}
//			System.out.println();
//		}
		
		for(int i = 1,day2=1; day2<=lastwk; i++) {
			if(i<firstwk) {
				System.out.print("   ");
			} else {
				System.out.printf(" %2d", day2++);
				if(i%7==0) System.out.println();
			}
			if(day2>lastwk) break;
		}
	}
}
