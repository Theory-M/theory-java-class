package pl.learn.theory.data_and_time.old_way;

import java.util.Calendar;
import java.util.Date;

public class OldDatetimeExample {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("now: " + now);

        //w milisekundach od 1970 roku
        System.out.println(now.getTime());
        Date nowAgain = new Date(now.getTime());
        System.out.println(nowAgain);
        Date tomorrow = new Date(1543152401594L + (24*60*60*1000));
        System.out.println(tomorrow);


        Calendar calendar = Calendar.getInstance();

        //calendar.setDate(przyjmuje Date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        calendar.add(Calendar.MONTH, -1);
        calendar.add(Calendar.YEAR, -1);
        System.out.println("calendar: " + calendar);
        System.out.println(calendar.getTime());

        //tak mi nie da - 395 dni bo sie przepelni
        calendar.add(Calendar.DAY_OF_MONTH, -395);
    }
}
