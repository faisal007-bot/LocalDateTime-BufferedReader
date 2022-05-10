package in.core.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class MyLocalDateTime {
	public static void main(String[] args) {
//		Local date

//		it returns the current date with month and year
		LocalDate now = LocalDate.now();
		System.out.println(now);

//		of() method is used to customize the output of the date
//		we can either pass date or date with month or date,month and year
		LocalDate dob = LocalDate.of(1997, Month.DECEMBER, 1);
		System.out.println(dob);

//		dateTimeformatter class used to 
//		format the output of the date, time and datetime
//		format method is used to format which takes dateTimeformatter as argument
//		using which we can customize the output of the date
		String formattedDob = LocalDate.of(1997, Month.DECEMBER, 1)
				.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(formattedDob);

//		local time

//		it returns the current time with minutes and seconds and nanoseconds
		LocalTime now2 = LocalTime.now();
		System.out.println(now2);

//		of() method is used to pass hour and minute or hour minute and second
//		or hour minute second and nanosecond
		LocalTime of = LocalTime.of(23, 34, 56);
		System.out.println(of);

//		formatting time using datetimeformatter
//		ofpattern method of datetimeformatter is used to set the pattern
//		a inside the ofpattern is used to specify time in AM and PM
		String formattedTime = LocalTime.of(22, 11, 44)
				.format(DateTimeFormatter.ofPattern("hh:mm:ss a"));
		System.out.println(formattedTime);
		
//		LocaldateTime
		
//		it returns the current date and time
//		it returns hours,minutes,seconds,year,month,day of month and nanoseconds also
//		it uses T before time to indicate that after T time is present
		LocalDateTime now3 = LocalDateTime.now();
		System.out.println(now3);
		
//		of() method is also used to set date with time
		LocalDateTime dob2 = LocalDateTime.of(1997, 12, 1, 23, 59, 59);
		System.out.println(dob2);
		
//		formatting datetime with datetimeformatter
		String formatDateTime = LocalDateTime.of(1997, 12,1,23,59,59)
			.format(DateTimeFormatter.ofPattern("hh:mm:ss a | yyyy-MM-dd"));
		System.out.println(formatDateTime);
	}
}
