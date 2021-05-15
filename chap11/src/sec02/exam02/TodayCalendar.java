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
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
			break;
		}
		
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		
		System.out.printf("%d년 %d월 %d일 %s요일 %d시 %d분", year, month, day, strWeek, hour, minute);
		
	}

}
