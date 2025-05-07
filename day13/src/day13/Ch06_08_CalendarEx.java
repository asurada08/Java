/*
public abstract class Calendar{
	Calendar Instance = new Calendar();
	public static Calendar getInstance() {
		return Instance;
	}
싱글톤 패턴 : 추상클래스라서 객체 생성 못함
자신의 클래스 내에서 멤버 변수로 선언하고, 베소드를 이용해서 객체를 생성해서 돌려줌
 */

package day13;

import java.util.Calendar;

public class Ch06_08_CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		// get()은 0~30까지의 정수 리턴
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);

		System.out.print(msg + year + " / " + month + " / " + day + " / ");
		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			System.out.print("일요일");
			break;
		case Calendar.MONDAY:
			System.out.print("울요일");
			break;
		case Calendar.THURSDAY:
			System.out.print("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.print("수요일");
			break;
		case Calendar.TUESDAY:
			System.out.print("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.print("금요일");
			break;
		case Calendar.SATURDAY:
			System.out.print("토요일");
			break;
		}
		System.out.print("(" + hourOfDay + "시)");
		if (ampm == Calendar.AM) {//am=0, pm=1 
			System.out.print(" 오전 ");
		} else {
			System.out.print(" 오후 ");
		}
		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");

	}

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("현재 ", now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2024, 01, 14);
		firstDate.set(Calendar.HOUR_OF_DAY, 9);
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("첫 수업 ", firstDate);
	}

}
/*
 * Calendar 클래스 java.util 패키지 시간과 날짜 정보 관리 : 년, 월, 일, 요일, 시간, 분, 초, 밀리초, 오전 오후 등
 * Calendar 객체 생성 : Calendar는 추상 클래스이므로 new Calendar() 하지 않음 Calendar now =
 * Calendar.getInstance(); 이용 now객체는 현재 날짜와 시간 정보를 가지고 생성됨 현재 날짜와 시간 int year =
 * now.get(Calendar.YEAR); // 현재 년도 int month = now.get(Calendar.MONTH) + 1; //
 * 현재 달 날짜와 시간 설정하기 : 내가 관리할 날짜와 시간을 Calendar객체를 이용하여 저장 - Calendar 객체에 날짜와 시간을
 * 설정한다고 해서 컴퓨터의 날짜와 시간을 바꾸지는 못함 - 컴퓨터의 시간과 날짜를 바꾸는 다른 방법 이용 // 이성 친구와 처음으로 데이트한
 * 날짜와 시간 저장 Calendar firstDate = Calendar.getInstance();
 * 
 * firstDate.clear(); // 현재 날짜와 시간 정보를 모두 지운다. firstDate.set(2012, 11, 25); //
 * 2012년 12월 25일. 12월은 11로 새로 설정함 firstDate.set(Calendar.HOUR_OF_DAY, 20); // 저녁
 * 8시로 설정 firstDate.set(Calendar.MINUTE, 30); // 30분으로 설정
 */