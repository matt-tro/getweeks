/** GetWeeks
 *  Mattia Trombon
 *  
 *  Obtain all limit weeks from a period included between two dates
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;

public class Main {
	
	static SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd"); 
	
	static String sfromData = ""; 	//from data
	static String stoData = ""; 	//to data
	
	static Calendar start = Calendar.getInstance();
	static Calendar end = Calendar.getInstance();
	
	static Date startTime;
	static Date endTime;
	
	public static void main(String args[]) throws ParseException{
		
		Date fromData = dt.parse(sfromData); 
		Date toData = dt.parse(stoData); 
		
		start.setTime(fromData);
		end.setTime(toData);
		
		startTime = start.getTime();
		endTime = end.getTime();
		
		Calendar calendarInstance = Calendar.getInstance();
		
		for (Date date = start.getTime(); 
				!start.after(end) || !start.after(calendarInstance); 
			 start.add(Calendar.DATE, 7), date = start.getTime()) {
				calendarInstance = (Calendar) end.clone();
				calendarInstance.add(Calendar.DATE, 7);
				getWeekDays(date,start,calendarInstance);
		}
		
	}

	private static void getWeekDays(Date date, Calendar start1, Calendar end1) {
		Calendar cl = Calendar.getInstance();
		cl.setFirstDayOfWeek(Calendar.MONDAY);
		cl.setTime(date);
		
		int week = cl.get(Calendar.WEEK_OF_YEAR);
		
		DateTime from = new DateTime(date);
		DateTime onTheFirstDayOfTheFirstWeek = from.withWeekyear(from.getYear()).withWeekOfWeekyear(week).withDayOfWeek(1);
		DateTime onTheLastDayOfTheFirstWeek = from.withWeekyear(from.getYear()).withWeekOfWeekyear(week).withDayOfWeek(7);
		
		if (onTheFirstDayOfTheFirstWeek.toDate().before(startTime)){
			Date dateFrom = start.getTime();
			onTheFirstDayOfTheFirstWeek = new DateTime(dateFrom);
		}
		
		if (onTheLastDayOfTheFirstWeek.toDate().after(endTime)){
			Date dateTo = end.getTime();
			onTheLastDayOfTheFirstWeek = new DateTime(dateTo);
		}
		
		if(onTheFirstDayOfTheFirstWeek.isAfter(onTheLastDayOfTheFirstWeek)){
			return;
		}
		
		System.out.println(dt.format(onTheFirstDayOfTheFirstWeek.toDate()) + " - " + dt.format(onTheLastDayOfTheFirstWeek.toDate()) + "\n");
		
	}
}
