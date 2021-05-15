package sec02.exam02;

import java.text.*;
import java.util.*;

public class TodayDateSimpleDateFormat {

	public static void main(String[] args) {
		Date today = new Date();
		String strToday = today.toString();
		System.out.println(strToday);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		String strToday2 = sdf.format(today);
		System.out.println(strToday2);
	}

}
