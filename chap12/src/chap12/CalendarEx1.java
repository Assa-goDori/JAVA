package chap12;

import java.util.Calendar;

/*
 * Calendar ����
 * Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� new Calendar() �����ڷ� ��ü ������ �Ұ���.
 * => getinstance() static �޼���� ��ü����.
 */
public class CalendarEx1 {
	public static void main(String[] args) {
//		Calendar now = new Calendar();			//��üȭ �Ұ�
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println("���� �⵵ : " + now.get(Calendar.YEAR));
		System.out.println("�̹� ��(0~11) : " + (now.get(Calendar.MONTH)+1));
		System.out.println("�⵵���� ��° �� : " + now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� ��° �� : " + now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("�������� : " + now.get(Calendar.DATE));
		System.out.println("�������� : " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("�⵵ ���� ��¥ : " + now.get(Calendar.DAY_OF_YEAR));
		System.out.println("����(��(1)~��(7)) : " + now.get(Calendar.DAY_OF_WEEK));
		System.out.println("�� ���� ��° ���� : " + now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		//�ð�
		System.out.println("����(0), ����(1) : " + now.get(Calendar.AM_PM));
		System.out.println("�ð�(0~11) : " + now.get(Calendar.HOUR));
		System.out.println("�ð�(0~23) : " + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("��(0~59) : " + now.get(Calendar.MINUTE));
		System.out.println("��(0~59) : " + now.get(Calendar.SECOND));
		System.out.println("�и���(0~999) : " + now.get(Calendar.MILLISECOND));
		//TimeZone : �׷�����(��������) ���� �󸶳� ���� �ð��� ���� �ִ��� ����
		System.out.println("TimeZone(-12~12) : " + now.get(Calendar.ZONE_OFFSET)/(60*60*1000));
		System.out.println("�̴��� ������ ���� : " + now.getMaximum(Calendar.DATE));
		
		//Calendar Ŭ������ 2020-02-24 �Ϸ� �����ϱ�
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 2-1, 24);
		System.out.println("��¥ : " + cal.get(Calendar.YEAR) + "�� "
							+ (cal.get(Calendar.MONTH)+1) + "�� "
							+ cal.get(Calendar.DATE) + "��");
		//2020-02-24 ���ϱ��ϱ�
		int a = cal.get(Calendar.DAY_OF_WEEK);
		switch (a) {
		case 1 : System.out.println("�Ͽ���"); break;
		case 2 : System.out.println("������"); break;
		case 3 : System.out.println("ȭ����"); break;
		case 4 : System.out.println("������"); break;
		case 5 : System.out.println("�����"); break;
		case 6 : System.out.println("�ݿ���"); break;
		case 7 : System.out.println("�����"); break;
		default : break;
		}
		//2020-02-24 ������ ���� ���ϱ�
		System.out.println("�̴��� ������ ���� : " + cal.getActualMaximum(Calendar.DATE));
	}
}