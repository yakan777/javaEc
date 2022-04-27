package day2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarLesson {

	public static void main(String[] args) {
		//Date now=new Date();
		Calendar cal=Calendar.getInstance();
		//cal.setTime(now);
		int date =cal.get(Calendar.DATE);
		cal.set(Calendar.DATE,date+100);
		Date d=cal.getTime();
		SimpleDateFormat sdf=
				new SimpleDateFormat("西暦yyyy年MM月dd日");
		String result=sdf.format(d);
		System.out.println(result);
	}

}
