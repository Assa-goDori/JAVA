package chap18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Predicate �������̽�
 *   �Ű����� ����, ���� ���� boolean���̰� test() �޼��带 ����.
 */
public class LambdaEx10 {
	private static List<Student> list = Arrays.asList
			(new Student("ȫ�浿",55,60,"�İ�"),
			new Student("�̸���",95,90,"�濵"),
			new Student("���",75,80,"�ɸ�"),
			new Student("�Ӳ���",65,70,"����"),
			new Student("������",65,10,"�İ�")
			);
	public static void main(String[] args) {
		System.out.println("���� ������ 60�� �̻��� �л��� ���� ��� : " + avgEng(s -> s.getEng()>60));
		System.out.println("�İ��� �л��� ���� ��� : " + avgEng(s -> s.getMajor().equals("�İ�")));
		System.out.println("�İ����� ������ �л����� ���� ��� : " + avgEng(s->s.getMajor()!="�İ�"));
		//����
		System.out.println("�İ��� �л��� �̸� : " + nameList(s -> s.getMajor().equals("�İ�")));
		System.out.println("�İ��� �л��� �ƴ� �л����� �̸� : " + nameList(s -> !s.getMajor().equals("�İ�")));
	}
	private static String nameList(Predicate<Student> pr) {
		String result = "";
		for(Student s : list) {
			if(pr.test(s)) {
				result += s.getName() + ",";
			}
		}
		return result;
	}
	private static double avgEng(Predicate<Student> pr) {
		int count = 0, sum = 0;
		for(Student s : list) {
			if(pr.test(s)) {
				count++;
				sum += s.getEng();
			}
		}
		return (double)sum/count;
	}
}