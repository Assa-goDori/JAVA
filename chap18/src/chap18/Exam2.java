package chap18;

public class Exam2 {
	public static void main(String[] args) {
		System.out.println("�μ�(5,2)�� �� : " + calc(5, 2, (x,y)->x+y));	//7
		System.out.println("�μ�(5,2)�� �� : " + calc(5, 2, (x,y)->x*y));	//10
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("arr �迭�� �ִ밪 : " + calc(arr, (x,y)->(x>y)?x:y));
		System.out.println("arr �迭�� �ּҰ� : " + calc(arr, (x,y)->(x<y)?x:y));
		
	}
	private static int calc(int[] arr, LambdaInterface4 f) {
		int result = arr[0];
		for(int i : arr) {
			result = f.method(result, i);
		}
		return result;
	}
	private static int calc(int i, int j, LambdaInterface4 f) {
		return f.method(i, j);
	}
}