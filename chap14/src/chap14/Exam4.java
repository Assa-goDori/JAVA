package chap14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

/*
 * 1. 대한민국(서울), 캐나다(오타와), 영국(런던), 스위스(베른)를 HashMap에 저장하고
 *    화면에서 나라이름을 입력받아 해당 나라의 수도를 출력하는 프로그램 작성하기
 * 2. 등록된 나라가 아닌 경우 "등록된 나라가 아닙니다. 수도를 입력하시겠습니까?(Y/N)"
 *                     "수도를 입력하세요" 메세지 출력 후 HashMap에 나라이름과 수도이름을 등록하기
 * 3. 프로그램 종료시 Map의 정보 출력
 *     keySet() 이용
 *     entrySet() 이용
 */
public class Exam4 {
	public static void main(String[] args) {
		Map<String, String> country = new HashMap<>();
		String[] arr1 = {"대한민국", "캐나다", "영국", "스위스"};
		String[] arr2 = {"서울", "오타와", "런던", "베른"};

		for(int i=0; i<arr1.length;i++) { country.put(arr1[i], arr2[i]); }		

		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("나라이름을 입력하세요(종료입력시 종료)");
			String name = scan.next();
			if(name.equals("종료")) break;
			if(country.get(name) == null) {
				System.out.println("등록된 나라가 아닙니다. 수도를 입력하시겠습니까(Y/N)");
				String YN = scan.next();
				if(YN.equalsIgnoreCase("y")) {
					System.out.println("수도를 입력하세요");
					String cap = scan.next();
					country.put(name, cap);
					System.out.println("등록이 완룓뢰었습니다.");
					continue;
				} else {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			System.out.println(country.get(name)+"\n");
		}
		Set<String> keys = country.keySet();
		for(String a : keys) {
			System.out.println(a + "의 수도는 " + country.get(a));
		}
		System.out.println("===================");
		Set<Map.Entry<String,String>> alls = country.entrySet();
		for(Map.Entry<String, String> b : alls) {
			System.out.println(b.getKey() + "의 수도는 " + b.getValue());
		}
	}
}