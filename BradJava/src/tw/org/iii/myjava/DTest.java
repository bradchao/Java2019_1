package tw.org.iii.myjava;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DTest {

	public static void main(String[] args) {
		LocalDate now= LocalDate.now();
		System.out.println(now);
		LocalDate birthday = LocalDate.of(2018, 3, 30);
		System.out.println(birthday);
		System.out.println(birthday.isLeapYear());
		System.out.println(now.isBefore(birthday));
		System.out.println(now.getDayOfMonth());
		LocalDate p2 = now.plusMonths(11);
		System.out.println(p2);
		LocalDate nm= now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println(nm);
		
		LocalTime nt = LocalTime.now();
		System.out.println(nt);
		LocalTime nt2 = nt.plusHours(1).plusMinutes(5);
		System.out.println(nt2);
		
		long days = ChronoUnit.DAYS.between(birthday, now);
		System.out.println(days);
		
		LocalDate deadline = LocalDate.of(2019, 12, 25);
		Period period = Period.between(now, deadline);
		System.out.println(period.getMonths() + "月" + period.getDays() + "天");
		
		
		
		
	}

}
