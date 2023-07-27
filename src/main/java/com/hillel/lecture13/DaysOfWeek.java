package com.hillel.lecture13;

public class DaysOfWeek {
    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek();

        String message = daysOfWeek.giveRecommendation(Day.WEDNESDAY);

        System.out.println(message);
    }

    public String giveRecommendation(Day day) {
        if (day == Day.WEDNESDAY) {
            System.out.println("Listen music");
        }
        if (day.isWorkingDay()) {
            return String.format("Today is %s. Don't forget to see a meeting list", day.getName());
        } else {
            return String.format("Today is weekend [%s]. Go to park", day.getName());
        }

    }
}

class Day {
    public static final Day MONDAY = new Day(1, "Monday");
    public static final Day WEDNESDAY = new Day(1, "Wednesday");
    public static final Day SUNDAY = new Day(7, "Sunday");

    private int numberOfDay;
    private String name;

    private Day(int numberOfDay) {
        if (numberOfDay < 1 || numberOfDay > 7) {
            throw new RuntimeException("ERROR! Unknown day");
        }
        this.numberOfDay = numberOfDay;
    }

    private Day(int numberOfDay, String name) {
        this(numberOfDay);
        this.name = name;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public String getName() {
        return name;
    }

    public boolean isWorkingDay() {
        return 1 <= numberOfDay && numberOfDay < 6;
    }
}
