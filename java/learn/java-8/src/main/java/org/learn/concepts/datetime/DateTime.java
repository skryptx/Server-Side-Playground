package org.learn.concepts.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTime {
    public static void main(String[] args) {
        var month = LocalDate.now().getMonth();
        System.out.println(month);
        System.out.println(month.getValue());

        System.out.println(LocalDate.now().minus(1, ChronoUnit.DECADES));

        System.out.println(LocalTime.of(10,10,10, 999999999));

        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = date1.plusDays(10);
        System.out.println(Period.between(date1.toLocalDate(), date2.toLocalDate()).get(ChronoUnit.DAYS));

    }
}

