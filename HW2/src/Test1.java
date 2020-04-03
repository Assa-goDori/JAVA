import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Person {
	String name;
	int height;
	Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
}
public class Test1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		map.put("홍길동", 172);
		map.put("성춘향", 164);
		map.put("이몽룡", 176);
		map.put("임꺽정", 183);
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("키를 알고 싶은 사람의 이름을 입력하세요 : (종료:끝)");
			String input = scan.next();
			if(input.equals("끝")) break;
			if(map.get(input)==null) {
				System.out.println("등록되지 않은 이름입니다.");
				continue;
			}
			
			System.out.println(input + "=" + map.get(input));
		}
		scan.close();
		System.out.println("등록된 목록:");
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		for(Map.Entry<String,Integer> s : set) {
			System.out.println(s);
		}
	}
}