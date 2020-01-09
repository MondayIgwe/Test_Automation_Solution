package java_Advanced;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class Date_Time {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime dateTime2 =LocalDateTime.of(2020, 1, 1, 20, 43);
		
		LocalDate d1 = LocalDate.of(2020, Month.JANUARY, 1);
		LocalTime t1 = LocalTime.of(20, 30, 20);
		System.out.println(date+"\n"+time+"\n"+dateTime
				+"\n"+d1+"\n"+t1+"\n"+dateTime2+"\n"+ new Date_Time().getFuture_Date()
				+"\n"+new Date_Time().getPast_Date());
		System.out.println();
		new Date_Time().date_Difference();
		
		System.out.println();
		
		System.out.println(new Date_Time().dateFormatter("01-26-1983"));
	}
	
	public LocalDate getFuture_Date() {
		LocalDate future = LocalDate.now().plusMonths(3);
	
		LocalTime addTime = LocalTime.now().plus(2, ChronoUnit.MINUTES);
		LocalTime addHours = LocalTime.now().plusHours(1);
		
		System.out.println("The future date is "+future
				+"\n One hour from the current time now is "+addHours
				+"\n"+addTime);
		
		return future;	
	}
	
	public LocalDate getPast_Date() {
		LocalDate past = LocalDate.now().minusMonths(2);
		LocalDate chronoUnit = LocalDate.now().minus(new Long(3), ChronoUnit.DECADES);
		LocalTime minusHours = LocalTime.now().minusHours(1);
		System.out.println("The past date is "+past
				+"\n and ChronoUnit is "+ chronoUnit
				+"\n One hour minus from now is "+minusHours);
		return past;
	}
	
	public Period date_Difference() {
		
		//PERIODS
		LocalDate myBithDay = LocalDate.of(1983, 9, 26);
		Period period = Period.between(myBithDay, LocalDate.now());
		System.out.println("The Difference is "+period.getYears() +" Years "+ period.getMonths()+" Months "
		+ period.getDays()+" Days ");
		
		System.out.println("\n The total period is "+period.toTotalMonths()
		+"\n"+period.withYears(1983));
		
		System.out.println();
		
		//Duration inTime
		LocalTime time = LocalTime.of(1, 5);
		Duration duration = Duration.between(time, LocalTime.now());
		System.out.println(duration.toMinutes());
		return period;
	 }
	
	public LocalDate dateFormatter(String date) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		LocalDate date2 = LocalDate.parse(date, formatter);
		return date2;
	}
	

}
