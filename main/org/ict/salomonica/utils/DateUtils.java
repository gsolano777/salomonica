package org.ict.salomonica.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static int getCurrentWeekOfTheYear() {
		Calendar cl = Calendar. getInstance();
		cl.setTime( new Date());
		
		return cl.get(Calendar.WEEK_OF_YEAR);
	}
	
	public static int getCurrentYear() {
		Calendar cl = Calendar. getInstance();
		cl.setTime( new Date());
		
		return cl.get(Calendar.YEAR);
	}
	
	public static int getCurrentWeekOfTheMonth() {
		Calendar cl = Calendar. getInstance();
		cl.setTime( new Date());
		cl.setMinimalDaysInFirstWeek(1);
		
		return cl.get(Calendar.WEEK_OF_MONTH);
	}
	
}
