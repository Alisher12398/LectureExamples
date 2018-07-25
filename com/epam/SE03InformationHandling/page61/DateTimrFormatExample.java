package com.epam.SE03InformationHandling.page61;

import java.util.Calendar;
import java.util.Formatter;

public class DateTimrFormatExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        formatter.format("%tr", calendar);
        System.out.println(formatter);
    }
}