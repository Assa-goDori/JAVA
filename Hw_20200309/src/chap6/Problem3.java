package chap6;

public class Problem3 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);


		if(num1>num2) {
			for(int i = 1; i<=num2; i++) {
				if(num2%i==0) {
					if(num1%i==0)	System.out.print(i + " ");
				}
			}
		} else {
			for(int i = 1; i<=num1; i++) {
				if(num1%i==0) {
					if(num2%i==0)	System.out.print(i + " ");
				}
			}
		}
	}
}
