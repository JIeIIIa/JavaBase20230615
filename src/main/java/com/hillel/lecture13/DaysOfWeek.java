package com.hillel.lecture13;

import java.util.Scanner;

import static com.hillel.lecture13.Day.WEDNESDAY;

public class DaysOfWeek {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek();

        System.out.print("Available days: ");
        Day[] days = Day.values();
        for (Day day : days) {
            System.out.print(day + ", ");
        }
        System.out.println();

        Day day = daysOfWeek.defineDayDefaultImpl();
        String message = daysOfWeek.giveRecommendation(day);
        System.out.println(message);
        message = daysOfWeek.giveRecommendation((String) null);

        System.out.println(message);
        day.run();
    }

    public Day defineDay() {
        String value = scanner.nextLine();
        for (Day day : Day.values()) {
            if (day.name().equalsIgnoreCase(value)) {
                return day;
            }
        }

        return null;
    }

    public Day defineDayDefaultImpl() {
        String value = scanner.nextLine();
        return Day.valueOf(value.toUpperCase());
    }

    public String giveRecommendation(String day) {
        return "TODO: add implementation! day is " + null;
    }

    public String giveRecommendation(Day day) {
        String message = "";
        if (WEDNESDAY.equals(day)) {
            message += "Listen music\n";
        }
        switch (day) {
            case MONDAY:
                message += buildWorkingDayMessage(day);
                break;
            case WEDNESDAY:
                message += buildWorkingDayMessage(day);
                break;
            case SUNDAY:
                message += String.format("Today is weekend [%s]. Go to park\n", day.getName());
        }

        return message;
    }

    private static String buildWorkingDayMessage(Day day) {
        String message = "";
        message += String.format("Today is %s. Don't forget to see a meeting list\n", day.name());
        message += String.format("Number of day is: %d\n", day.ordinal());
        return message;
    }
}

enum Day implements Runnable {
    MONDAY("Monday", true),
    TUESDAY("Tuesday", true),

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

    @Override
    public void run() {
        System.out.println("Run on " + this.name + " [isWorkingDay == " + this.workingDay + "]");
    }
}
