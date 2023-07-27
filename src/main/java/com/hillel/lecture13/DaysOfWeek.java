package com.hillel.lecture13;

public class DaysOfWeek {
    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek();

        String message = daysOfWeek.giveRecommendation(Day.WEDNESDAY);

        System.out.println(message);
    }

    public String giveRecommendation(Day day) {
        String message = "";
        if (day == Day.WEDNESDAY) {
            message += "Listen music\n";
        }
        if (day.isWorkingDay()) {
            message += String.format("Today is %s. Don't forget to see a meeting list", day.getName());
        } else {
            message += String.format("Today is weekend [%s]. Go to park", day.getName());
        }

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
