package com.hkg.test;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class DateTimeTest {

	public static void main(String[] args) {
		
		  Date date = new Date();
	      String strDateFormat = "HH:mm:ss a";
	      SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
	      System.out.println(sdf.format(date));
	      
	      Formatter fmt = new Formatter();
	      Calendar cal = Calendar.getInstance();
	      fmt = new Formatter();
	      fmt.format("%tB %tb %tm %tl:%tM %tc", cal, cal, cal,cal,cal,cal);
	      System.out.println(fmt);
	     
	      
	      String[] weekdays = new DateFormatSymbols().getWeekdays();
	      for (int i = 2; i < (weekdays.length-1); i++) {
	         String weekday = weekdays[i];
	         System.out.println("weekday = " + weekday);
	      }
	      
	      Date d1 = new Date();
	      Calendar cl = Calendar. getInstance();
	      cl.setTime(d1);
	      System.out.println("today is " + d1.toString());
	      
	      cl. add(Calendar.MONTH, 1);
	      System.out.println("date after a month will be " + cl.getTime().toString() );
	      
	      cl. add(Calendar.HOUR, 70);
	      System.out.println("date after 70 hrs will be "+ cl.getTime().toString() );
	      cl. add(Calendar.YEAR, 3);
	      
	      System.out.println("date after 3 years will be "+ cl.getTime().toString() );
	      
	      System.out.println("today is "+ cl.WEEK_OF_YEAR+ " week of the year");
	      System.out.println("today is a "+cl.DAY_OF_MONTH +"month of the year");
	      System.out.println("today is a "+cl.WEEK_OF_MONTH +"week of the month");
	}

}
