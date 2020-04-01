package chap5;

public class HomeWork1 {

	public static void main(String[] args) {
//		int i, j, k=0;
//		for(i=2;i<=5;i++) {
//			System.out.print(i + "´Ü" + "\t");
//		}
//		System.out.println();
//		
//		for(j=2;j<=9;j++) {
//			for(k=2;k<=5;k++) {
//				System.out.print(k + "*" + j + "=" + (j*k) + "\t");
//			}
//		System.out.println();
//		}
//		
//		System.out.println();
//		
//		for(i=6;i<=9;i++) {
//			System.out.print(i + "´Ü" + "\t");
//		}
//		System.out.println();
//		
//		for(j=2;j<=9;j++) {
//			for(k=6;k<=9;k++) {
//				System.out.print(k + "*" + j + "=" + (j*k) + "\t");
//			}
//		System.out.println();
//		}
		
		for(int k = 2;k<=9; k+=4) {
			for(int i = 0; i< 4; i++) {
				System.out.print((i+k) + "´Ü\t");
			}
			System.out.println();
			for(int j = 2; j <=9; j++) {
				for(int i=k; i <k+4; i++) {
					System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
