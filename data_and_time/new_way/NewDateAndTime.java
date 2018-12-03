package pl.learn.theory.data_and_time.new_way;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NewDateAndTime {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(18,5);

        // nie moge po prostu odjac 5 minut, bo jest IMMUTABLE, wiec musze inaczej
        localTime.minusMinutes(5);

        //tak odjac 5 minut
        LocalTime fiveMinutesEarlier = localTime1.minusMinutes(5);

        System.out.println("five minutes earlier: " +fiveMinutesEarlier);
        System.out.println("localTime1: " + localTime1);

        LocalDate localDate = LocalDate.now();
        System.out.println("local date: " + localDate);

        // grunwald po mojemu
        LocalDate grunwald = localDate.minusMonths(608*12 + 5);
        System.out.println(grunwald);

//        // grunwald lepiej
//        LocalDate grunwald2 = localDate

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate,localTime);

        String formatted = localDateTime.format(DateTimeFormatter.ofPattern("YYYY:MM:dd ___ HH///mm"));
        System.out.println("formatted time: " + formatted);

        Date maybeNow = new Date();
        // konwert do LocalDateTime

        long time = maybeNow.getTime();

        Instant instant = Instant.ofEpochMilli(time);
        LocalDateTime maybeNowNewWay = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println("converted time: " + maybeNowNewWay);

    }


}
