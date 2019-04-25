package date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class DateCls {
    public static void main(String[] args) throws InterruptedException {
//        LocalDate date;
//        date=LocalDate.now();
//        System.out.println(date);
//        date=date.minusDays(2);
//        System.out.println(date);
//        date=date.plusWeeks(2);
//        System.out.println(date);
//        date=LocalDate.of(2364,04,04);
//        System.out.println(date);
//        date=LocalDate.of(2009, Month.JULY,22);
//        System.out.println(date);

        LocalTime time1=LocalTime.now();
        System.out.println(time1);
        Thread.sleep(5000);
        LocalTime time2=LocalTime.now();
        System.out.println(time2);
        System.out.println(time2.compareTo(time1));
        Duration timeElapsed = Duration.between(time1, time2);
        System.out.println(timeElapsed.toMillis());
//        time=LocalTime.of(02,58);
//        System.out.println(time);

    }
}
