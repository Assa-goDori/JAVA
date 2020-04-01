package chap14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
 * 화면에서 홀수개의 숫자를 입력받아서 입력받은 숫자의 평균과 중간값 출력하기
 * 
 * 10 40 30 60 30
 * 
 * 정렬 : 10 30 30 40 60
 * 중간값 : 30
 * 평균 : 34  (전체합/갯수)
 */
public class Exam1 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("홀수개의 숫자를 입력하세요(종료 : 999)");
		List<Integer> list = new ArrayList<Integer>();

		while(scan.hasNextInt()) {
			int input = scan.nextInt();
			if(input == 999) break;
			list.add(input);
			sum += input;
			
		}
		//짝수개 입력시  마지막 입력된 내용을 삭제하기
		if(list.size()%2 == 0) list.remove(list.size()-1);
		System.out.println("list : " + list);
		Collections.sort(list);
		System.out.println("정렬 list : " + list);
		System.out.println("입력 숫자의 합 : " + sum);
		System.out.println("입력 숫자의 평균 : " + sum/(list.size()));
		System.out.println("입력 숫자의 중간 값 : " + list.get(list.size()/2));
		scan.close();
	}
}