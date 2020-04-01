package chap14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map 인터페이스 : (Key, 객체) 쌍으로 객체를 모으는 객체.
 * 
 *    객체 추가&수정 : put(Key, 객체)
 *                현재 등록되어있는 Key를 다시 추가하면 수정된다.
 *    Key를 이용하여 객체 조회 : 객체 = get(Key)
 *    Key들만 조회 : Set keySet()
 *    객체들만 조회 : Collection values()
 *    Key, 객체 쌍인 객체들을 조회 : Set<Map.Entry<T, T>> entrySet()
 *    객체 제거 : remove(Key)
 *    
 * 
 * 구현 클래스 : HashMap, HashTable, TreeMap
 *      HashTable은 Collection 프레임워크 이전에 사용되던 클래스. Thread에 대해서 Safe하다.
 *      HashMap은 Thread에 대해서 Not Safe 하다.
 */
public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String[] names = {"홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓"};
		int[] nums = {1234, 4567, 2350, 9870, 3456};
		for(int i = 0; i<names.length;i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		//김삿갓 전화번호 출력 : 객체 <= map.get(키값)
		System.out.println("김삿갓의 전화번호 : " + map.get("김삿갓"));
		//홍길동 전화번호 출력
		System.out.println("홍길동의 전화번호 : " + map.get("홍길동"));
		System.out.println("성춘향의 전화번호 : " + map.get("성춘향"));			//null값 리턴(오류발생 x)
		//Map에서 Key들만 조회		keySet() 리턴타입 : Set
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + " = " + map.get(k));
		}
		//Map에서 객체들만 조회		values() 리턴타입 : Collection<T>
		Collection<Integer> values = map.values();
		System.out.println(values);
		for(Integer v : values) {
			System.out.println(v);
		}
		//Map에서 (Key, 객체) 쌍인 객체 조회		entrySet() 리턴타입 : Set<Map.Entry<K, V>>
		System.out.println("=========================");
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m);
			System.out.println("[getKey(), getValue()] => " + m.getKey() + "=" + m.getValue());
		}
		//홍길동 값 제거하기
		Integer value = map.remove("홍길동");		//key값에 해당하는 객체를 지우면서 그 값을 리턴해줌
		System.out.println(value);
		System.out.println(map);
	}
}