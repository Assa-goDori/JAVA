public class Problem8 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		for(int i = 0; i<arr.length; i++) {
			int rannum = (int)(Math.random()*100+1);
			arr[i] = rannum;
		}
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}