import java.util.Scanner;
public class Problem10 {
	public static void main(String[] args) {
		int arr[] = new int[2];
		System.out.println("두 수를 입력하세요");
		for(int i = 0; i<arr.length;i++) {
			Scanner scan = new Scanner(System.in);
			arr[i] = scan.nextInt();
		}
		
		if(arr[0]>arr[1]) {
			for(int i = 1; i<=arr[1]; i++) {
				if(arr[1]%i==0 && arr[0]%i==0)
					System.out.print(i + (i==arr[1]?" ":", "));
			}
		} else {
			for(int i = 1; i<=arr[0]; i++) {
				if(arr[1]%i==0 && arr[0]%i==0)
					System.out.print(i + (i==arr[0]?" ":", "));
			}
		}
	}
}