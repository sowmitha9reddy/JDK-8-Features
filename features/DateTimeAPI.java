package features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeAPI {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getMonthValue());
        
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());
        System.out.println(lt.getNano());
        
        
        System.err.println(LocalDateTime.now()); // to display error
        System.out.println(LocalDateTime.now()); //to display output
        
	}

}
