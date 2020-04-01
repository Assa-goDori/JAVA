import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
 * 다음 결과가 나오도록 프로그램을 작성하시오
 1 ~ 1000번까지의 번호를 가지는 복권이 있다.
 1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
  단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
  추첨된 번호는 임의의 수이므로 숫자 값은 실행 할때 마다 다르다.

  LinkedHashSet : 순서유지, 중복불가
  Random
  new ArrayList(Set) : Set 객체를 List객체로 생성

 [결과]
3등 복권 추첨합니다.
945
123
6
2등 복권 추첨합니다.
611
404
1등 복권 추첨합니다.
797

*** 복권 추첨 결과 ***

1등:797,
2등:404,611,
3등:6,123,945,
 */
public class Test2 {
	public static void main(String[] args) {
		Random ran = new Random();
		ran.setSeed(System.currentTimeMillis());
		Set<Integer> lotto = new LinkedHashSet<Integer>();
		
//		for(int i = 3, size = 0; i>0; i--) {
//			System.out.println(i + "등 복권 추첨합니다.");
//			while(lotto.size()<size+i) {
//				int num = ran.nextInt(1000)+1;
//				lotto.add(num);
//				System.out.println(num);
//			}
//			size += i;
//		}
//
//		List<Integer> lotto2 = new ArrayList<Integer>(lotto);
//		System.out.println("***복권 추첨 결과***");
//		for(int i=1; i<=3;i++) {
//			System.out.print((i+1) + "등 : ");
//			for(int j = 0; j<i;j++) {
//				System.out.print(lotto2.get(6-i-j) + ",");
//			}
//			System.out.println();
//		}
		
		while(lotto.size()<6) {
			int num = ran.nextInt(1000)+1;
			lotto.add(num);
		}
		List<Integer> lotto2 = new ArrayList<Integer>(lotto);
		for(int i = 3, index = 0; i>0; i--) {
			System.out.println(i + "등 복권 추첨합니다.");
			for(int j = i; j>0; j--) {
				System.out.println(lotto2.get(index++));
			}	
		}
		System.out.println("***복권 추첨 결과***");
//		for(int i = 1, index = lotto2.size()-1; i<=3; i++) {
//			System.out.print(i + "등 : ");
//			for(int j = 0; j<i; j++) {
//				System.out.print(lotto2.get(index--) + ",");
//			}
//			System.out.println();
//		}
		System.out.println("1등 : " + lotto2.subList(5, 6));
		System.out.println("2등 : " + lotto2.subList(3, 5));
		System.out.println("3등 : " + lotto2.subList(0, 3));
	}
}