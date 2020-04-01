package chap6;

public class Problem2 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		for(int i = 1; i<=num; i++) {
			if(num%i==0)
				System.out.print(i + " ");
		}
	}

}
