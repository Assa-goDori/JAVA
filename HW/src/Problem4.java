public class Problem4 {
	public static void main(String[] args) {
		int[] cube1= {1,2,3,4,5,6};
		int[] cube2= {1,2,3,4,5,6};
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(cube1[i]+cube2[j]==6) System.out.println(cube1[i] + " + " + cube2[j] + " = " + (cube1[i]+cube2[j]));
			}
		}
	}
}