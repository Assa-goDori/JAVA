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
		map.put("ȫ�浿", 172);
		map.put("������", 164);
		map.put("�̸���", 176);
		map.put("�Ӳ���", 183);
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Ű�� �˰� ���� ����� �̸��� �Է��ϼ��� : (����:��)");
			String input = scan.next();
			if(input.equals("��")) break;
			if(map.get(input)==null) {
				System.out.println("��ϵ��� ���� �̸��Դϴ�.");
				continue;
			}
			
			System.out.println(input + "=" + map.get(input));
		}
		scan.close();
		System.out.println("��ϵ� ���:");
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		for(Map.Entry<String,Integer> s : set) {
			System.out.println(s);
		}
	}
}