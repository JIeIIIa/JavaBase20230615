package com.hillel.lecture13;

public class DaysOfWeek {
    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        Day monday = new Day(-1);
        String message = daysOfWeek.giveRecommendation(monday);

        System.out.println(message);
    }

    public String giveRecommendation(Day day) {
        if (day.isWorkingDay()) {
            return "Don't forget to see a meeting list";
        } else {
            return "Go to park";
        }

    }
}

class Day {
    private int numberOfDay;

    public Day(int numberOfDay) {
        if (numberOfDay < 1 || numberOfDay > 7) {
            throw new RuntimeException("ERROR! Unknown day");
        }
        this.numberOfDay = numberOfDay;
    }

    public boolean isWorkingDay() {
        return 1 <= numberOfDay && numberOfDay < 6;
    }
}
