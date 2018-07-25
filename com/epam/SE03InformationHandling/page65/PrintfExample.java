package com.epam.SE03InformationHandling.page65;

import java.util.Calendar;
import java.util.Locale;

public class PrintfExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.printf(Locale.FRANCE, "%1$tB %1$tA%n", cal);
        System.out.printf(Locale.getDefault(), "%1$tB %1$tA%n", cal);
    }
}
