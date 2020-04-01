package chap5;

public class Exam6 {

	public static void main(String[] args) {
		for(int j=2;j<=9;j++) {
			System.out.print(j + "´Ü" + "\t\t");
		}
		
		System.out.println();
		
		for(int i=2;i<=9;i++) {	
			for(int k=2;k<=9;k++) {
				System.out.print(k + " x " + i + " = " + i*k + "\t");
			}
		
		System.out.println();
		}
	}

}
