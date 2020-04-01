package chap12;

import java.util.Calendar;

/*
 * Calendar 예제
 * Calendar 클래스는 추상클래스이므로 new Calendar() 생성자로 객체 생성이 불가함.
 * => getinstance() static 메서드로 객체리턴.
 */
public class CalendarEx1 {
	public static void main(String[] args) {
//		Calendar now = new Calendar();			//객체화 불가
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println("올해 년도 : " + now.get(Calendar.YEAR));
		System.out.println("이번 달(0~11) : " + (now.get(Calendar.MONTH)+1));
		System.out.println("년도기준 몇째 주 : " + now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월 기준 몇째 주 : " + now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("오늘일자 : " + now.get(Calendar.DATE));
		System.out.println("오늘일자 : " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("년도 기준 날짜 : " + now.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(일(1)~토(7)) : " + now.get(Calendar.DAY_OF_WEEK));
		System.out.println("월 기준 몇째 요일 : " + now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		//시간
		System.out.println("오전(0), 오후(1) : " + now.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : " + now.get(Calendar.HOUR));
		System.out.println("시간(0~23) : " + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : " + now.get(Calendar.MINUTE));
		System.out.println("초(0~59) : " + now.get(Calendar.SECOND));
		System.out.println("밀리초(0~999) : " + now.get(Calendar.MILLISECOND));
		//TimeZone : 그레고리시(영국기준) 보다 얼마나 빠른 시간을 갖고 있는지 리턴
		System.out.println("TimeZone(-12~12) : " + now.get(Calendar.ZONE_OFFSET)/(60*60*1000));
		System.out.println("이달의 마지막 일자 : " + now.getMaximum(Calendar.DATE));
		
		//Calendar 클래스로 2020-02-24 일로 설정하기
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 2-1, 24);
		System.out.println("날짜 : " + cal.get(Calendar.YEAR) + "년 "
							+ (cal.get(Calendar.MONTH)+1) + "월 "
							+ cal.get(Calendar.DATE) + "일");
		//2020-02-24 요일구하기
		int a = cal.get(Calendar.DAY_OF_WEEK);
		switch (a) {
		case 1 : System.out.println("일요일"); break;
		case 2 : System.out.println("월요일"); break;
		case 3 : System.out.println("화요일"); break;
		case 4 : System.out.println("수요일"); break;
		case 5 : System.out.println("목요일"); break;
		case 6 : System.out.println("금요일"); break;
		case 7 : System.out.println("토요일"); break;
		default : break;
		}
		//2020-02-24 마지막 일자 구하기
		System.out.println("이달의 마지막 일자 : " + cal.getActualMaximum(Calendar.DATE));
	}
}