package chapter09.exam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Birthday {

	public static void main(String[] args) {
		
		LocalDate birthDay = LocalDate.of(1997, 6, 9);
		LocalDate now = LocalDate.now();
		
		long days = ChronoUnit.DAYS.between(birthDay, now);
		System.out.println("지금까지 살아온 일수 :" + days + "일");
		
		System.out.println("현재 나이 : 만" + days/365 + "살" );
	}
}
