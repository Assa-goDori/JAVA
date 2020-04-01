package chap5;

public class Exam10 {
	public static void main(String[] args) {
		int i, j;
		int sum = 0;
		for(i=1; i<=10; i++) {
			System.out.print("(");
			for(j=1; j<=i; j++) {
				System.out.print(j);
				sum+=j;
				if(j==i)	break;
				System.out.print("+");
			}
			System.out.print(")");
			if(i==10)	break;
			System.out.print("+");
		}
		System.out.println(" = " + sum);
	}

}
