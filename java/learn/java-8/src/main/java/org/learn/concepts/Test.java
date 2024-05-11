package org.learn.concepts;

import java.time.LocalDate;
import java.time.Period;

public class Test {

    public static void main(String[] args) {
        var month = LocalDate.now().getMonth();
        System.out.println(month);
        System.out.println(month.getValue());

        System.out.println(LocalDate.now().minus(Period.ofDays(10)));

    }
}
