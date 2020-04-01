package chap14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map �������̽� : (Key, ��ü) ������ ��ü�� ������ ��ü.
 * 
 *    ��ü �߰�&���� : put(Key, ��ü)
 *                ���� ��ϵǾ��ִ� Key�� �ٽ� �߰��ϸ� �����ȴ�.
 *    Key�� �̿��Ͽ� ��ü ��ȸ : ��ü = get(Key)
 *    Key�鸸 ��ȸ : Set keySet()
 *    ��ü�鸸 ��ȸ : Collection values()
 *    Key, ��ü ���� ��ü���� ��ȸ : Set<Map.Entry<T, T>> entrySet()
 *    ��ü ���� : remove(Key)
 *    
 * 
 * ���� Ŭ���� : HashMap, HashTable, TreeMap
 *      HashTable�� Collection �����ӿ�ũ ������ ���Ǵ� Ŭ����. Thread�� ���ؼ� Safe�ϴ�.
 *      HashMap�� Thread�� ���ؼ� Not Safe �ϴ�.
 */
public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String[] names = {"ȫ�浿", "���", "�̸���", "�Ӳ���", "���"};
		int[] nums = {1234, 4567, 2350, 9870, 3456};
		for(int i = 0; i<names.length;i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		//��� ��ȭ��ȣ ��� : ��ü <= map.get(Ű��)
		System.out.println("����� ��ȭ��ȣ : " + map.get("���"));
		//ȫ�浿 ��ȭ��ȣ ���
		System.out.println("ȫ�浿�� ��ȭ��ȣ : " + map.get("ȫ�浿"));
		System.out.println("�������� ��ȭ��ȣ : " + map.get("������"));			//null�� ����(�����߻� x)
		//Map���� Key�鸸 ��ȸ		keySet() ����Ÿ�� : Set
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + " = " + map.get(k));
		}
		//Map���� ��ü�鸸 ��ȸ		values() ����Ÿ�� : Collection<T>
		Collection<Integer> values = map.values();
		System.out.println(values);
		for(Integer v : values) {
			System.out.println(v);
		}
		//Map���� (Key, ��ü) ���� ��ü ��ȸ		entrySet() ����Ÿ�� : Set<Map.Entry<K, V>>
		System.out.println("=========================");
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m);
			System.out.println("[getKey(), getValue()] => " + m.getKey() + "=" + m.getValue());
		}
		//ȫ�浿 �� �����ϱ�
		Integer value = map.remove("ȫ�浿");		//key���� �ش��ϴ� ��ü�� ����鼭 �� ���� ��������
		System.out.println(value);
		System.out.println(map);
	}
}