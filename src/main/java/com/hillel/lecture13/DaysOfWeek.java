package com.hillel.lecture13;

public class DaysOfWeek {
    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        String message = daysOfWeek.giveRecommendation(-1);

        System.out.println(message);
    }

    public String giveRecommendation(int day) {
        if (1 <= day && day < 6) {
            return "Don't forget to see a meeting list";
        } else if (day == 6 || day == 7) {
            return "Go to park";
        }

        return "ERROR! Unknown day";
    }
}
