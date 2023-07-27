package com.hillel.lecture13;

import static com.hillel.lecture13.Day.MONDAY;
import static com.hillel.lecture13.Day.WEDNESDAY;

public class DaysOfWeek {
    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek();

        String message = daysOfWeek.giveRecommendation(MONDAY);

        System.out.println(message);
    }

    public String giveRecommendation(Day day) {
        String message = "";
        if (day == WEDNESDAY) {
            message += "Listen music\n";
        }
        switch (day) {
            case MONDAY:
                message += buildWorkingDayMessage(day, message);
                break;
            case WEDNESDAY:
                message += buildWorkingDayMessage(day, message);
                break;
            case SUNDAY:
                message += String.format("Today is weekend [%s]. Go to park\n", day.getName());

        }

        return message;
    }

    private static String buildWorkingDayMessage(Day day, String message) {
        message += String.format("Today is %s. Don't forget to see a meeting list\n", day.getName());
        return message;
    }
}

enum Day {
    MONDAY("Monday", true),
    WEDNESDAY("Wednesday", true),
    SUNDAY("Sunday", false);

    private String name;
    private boolean workingDay;

    Day(String name, boolean workingDay) {
        this.name = name;
        this.workingDay = workingDay;
    }

    public String getName() {
        return name;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }
}
