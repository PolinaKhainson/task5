package com.java.courses.tasks.task5_4;

public class RandomNumberFromFiveToTwentyFive {
    public static void main(String[] args) {
        getRandomNumber();
    }

    public static void getRandomNumber() {
        int rnd =  (int) (Math.random() * 21 + 5);
        System.out.println(rnd);
    }
}

