package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {

	public static void main(String[] args) {
		LocalDate myDate = LocalDate.now();
		System.out.println(myDate);
		
		LocalTime myTime = LocalTime.now();
		System.out.println(myTime);
		
		LocalDateTime mydt = LocalDateTime.now();
		System.out.println(mydt);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String modDate = df.format(mydt);
		System.out.println(modDate);

		String datestr = "11-02-2020";
		LocalDate d = LocalDate.parse(datestr,df);
		System.out.println(d);
	}

}
