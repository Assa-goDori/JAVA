package chap19;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * 외부 반복자와 내부 반복자
 *   기존의 방식으로 조회하는 방법과 스트림식 조화 방법 비교
 */
public class IteratorEx1 {
	public static void main(String[] args) {
		List<String> list = 
				Arrays.asList("홍길동", "김삿갓", "이몽룡", "성춘향", "임꺽정","향단이");
		System.out.println("외부 반복자 이용");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("내부 반복자 이용(Stream 방식)");
		list.stream().forEach(s->System.out.println(s));
		
		Stream<String> st = list.stream();
		System.out.println("forEach 메서드 사용하기 1");
		st.forEach(s -> System.out.println(s));
		System.out.println("forEach 메서드 사용하기 2");
//		st.forEach(s -> System.out.println(s));		//이미 st가 list의 마지막 인덱스에 해당하고 있으므로 st다시호출시 마지막 인덱스부터 읽어야 하므로 오류 발생
		list.stream().forEach(s->System.out.println(s));	//따라서 st변수 생성이 아니라 list.stream()으로 많이 사용
	}
}