package sec02.exam02;

import java.text.*;
import java.util.*;

public class TodayDateSimpleDateFormat {

	public static void main(String[] args) {
		Date today = new Date();
		String strToday = today.toString();
		System.out.println(strToday);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
		String strToday2 = sdf.format(today);
		System.out.println(strToday2);
	}

}
