package chap14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

/*
 * 1. ���ѹα�(����), ĳ����(��Ÿ��), ����(����), ������(����)�� HashMap�� �����ϰ�
 *    ȭ�鿡�� �����̸��� �Է¹޾� �ش� ������ ������ ����ϴ� ���α׷� �ۼ��ϱ�
 * 2. ��ϵ� ���� �ƴ� ��� "��ϵ� ���� �ƴմϴ�. ������ �Է��Ͻðڽ��ϱ�?(Y/N)"
 *                     "������ �Է��ϼ���" �޼��� ��� �� HashMap�� �����̸��� �����̸��� ����ϱ�
 * 3. ���α׷� ����� Map�� ���� ���
 *     keySet() �̿�
 *     entrySet() �̿�
 */
public class Exam4 {
	public static void main(String[] args) {
		Map<String, String> country = new HashMap<>();
		String[] arr1 = {"���ѹα�", "ĳ����", "����", "������"};
		String[] arr2 = {"����", "��Ÿ��", "����", "����"};

		for(int i=0; i<arr1.length;i++) { country.put(arr1[i], arr2[i]); }		

		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("�����̸��� �Է��ϼ���(�����Է½� ����)");
			String name = scan.next();
			if(name.equals("����")) break;
			if(country.get(name) == null) {
				System.out.println("��ϵ� ���� �ƴմϴ�. ������ �Է��Ͻðڽ��ϱ�(Y/N)");
				String YN = scan.next();
				if(YN.equalsIgnoreCase("y")) {
					System.out.println("������ �Է��ϼ���");
					String cap = scan.next();
					country.put(name, cap);
					System.out.println("����� �Ϗ��ھ����ϴ�.");
					continue;
				} else {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
			}
			System.out.println(country.get(name)+"\n");
		}
		Set<String> keys = country.keySet();
		for(String a : keys) {
			System.out.println(a + "�� ������ " + country.get(a));
		}
		System.out.println("===================");
		Set<Map.Entry<String,String>> alls = country.entrySet();
		for(Map.Entry<String, String> b : alls) {
			System.out.println(b.getKey() + "�� ������ " + b.getValue());
		}
	}
}