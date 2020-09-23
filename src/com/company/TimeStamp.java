package com.company;
import java.util.*;

public class TimeStamp {
    private int year;
    int month;
    int day;
    int hour;
    int min;

    TimeStamp(String s) {
        String[] splitString = s.split("-|:|T");
        System.out.println(Arrays.toString(splitString));
        this.year = Integer.parseInt(splitString[0]);
        this.month = Integer.parseInt(splitString[0]);
        this.day = Integer.parseInt(splitString[0]);
        this.hour = Integer.parseInt(splitString[0]);
        this.min = Integer.parseInt(splitString[0]);

    }

    private boolean isValidYear(int year) {
        return true;
    }

    public String getTimeStamp() {
        return this.year + "-" + this.month + "-" + this.day + "T" + this.hour + ":" + this.min;
    }
}
