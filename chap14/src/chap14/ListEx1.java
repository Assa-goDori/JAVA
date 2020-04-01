package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/*
 * List 예제
 * List 인터페이스 : Collection 인터페이스의 하위 인터페이스
 *                객체들을 저장할 때 순서를 유지
 *      구현클래스 : ArrayList, Vector 등이 있다.
 */
public class ListEx1 {
	public static void main(String[] args) {
		//<Integer> : 제네릭표현
		//List<Integer> : Integer 객체를 여러개 저장할 수 있는 자료형
		List<Integer> list = new ArrayList<Integer>();
		list.add(1); list.add(2); list.add(5);
		list.add(4); list.add(3); list.add(0);
		list.add(0);
		System.out.println(list);
		//list.size() : list 객체에 저장된 요소(Element)의 갯수 리턴
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		//list.subList(1, 4) : 부분 list 객체 (1번 인덱스~3번 인덱스)
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		System.out.println(list2);
		//Collection 인터페이스
		//Collections 클래스 : Collection 프레임워크에 관련된 기능을 수행하기 위한 클래스
		Collections.sort(list2);	//list2 객체를 정렬함.
		System.out.println(list2);
		
		List<String> list3 = new ArrayList<String>();
		list3.add("1번"); list3.add("2번"); list3.add("3번"); list3.add(1+""); //1을 String타입으로 저장시 1+"" 이용
		System.out.println(list3);
		
		List list4 = new ArrayList();	//모든클래스의 객체를 요소로 저장(Object타입)
		list4.add(1); list4.add("1번"); list4.add(new Date());
		System.out.println(list4);
	}
}