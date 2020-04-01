package chap7;
/*
 * 배열로 저장하기
 */
public class PhoneEx2 {
	public static void main(String[] args) {
		Phone[] parr = new Phone[3];		//Phone 객체를 저장할 참조변수 3개를 배열로 저장
		for(int i = 0; i<parr.length; i++) {
			parr[i] = new Phone();			//Phone 객체의 객체화
			parr[i].no = i + "1234";
		}
		for(Phone p : parr) {
			System.out.printf("%s\n",p.no);	//%s : 문자열 출력
		}
		for(int i = 0; i<parr.length; i++) {
			parr[i].send((i==0)?parr[parr.length-1].no:parr[i-1].no);
		}
	}

}
