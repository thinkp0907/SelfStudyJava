package sec02.exam02;

import java.util.*;

public class TodayCalendar {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DAY_OF_MONTH);
		int Weekday = today.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		
		switch(Weekday) {
		case Calendar.MONDAY:
			strWeek = "��";
			break;
		case Calendar.TUESDAY:
			strWeek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "��";
			break;
		case Calendar.THURSDAY:
			strWeek = "��";
			break;
		case Calendar.FRIDAY:
			strWeek = "��";
			break;
		case Calendar.SATURDAY:
			strWeek = "��";
			break;
		default:
			strWeek = "��";
			break;
		}
		
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		
		System.out.printf("%d�� %d�� %d�� %s���� %d�� %d��", year, month, day, strWeek, hour, minute);
		
	}

}
