public class Test2 {
	public static void main(String[] args) {
		for(int i = 0; i<20; i++) {
			System.out.print(getRand(1, -3) + ", ");
		}
		System.out.println();
		for(int i = 0; i<20; i++) {
			System.out.print(getRand(-1, 3) + ", ");
		}
	}
	static int getRand(int startNum, int endNum) {
		if(startNum>endNum) {
			int a = (int)(Math.random()*(startNum-endNum+1))+endNum;
			return a;
		} else {
			int a = (int)(Math.random()*(endNum-startNum+1))+startNum;
			return a;
		}
	}
}