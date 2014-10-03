package com.java.courses.tasks.task5_2;

public class PrimeNumbers {
    public static void main(String[] args) {
        getPrimeNumbers(10);
    }

    static void getPrimeNumbers(int amountOfNumbers) {
        /*Цикл для количества чисел*/
        for (int k = 0; k < amountOfNumbers; ) {
            /*Бесконечный цикл для перебора всех натуральных чисел*/
            for (int i = 3; ; i++) {
                if ((i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) || i == 3 || i == 7) {
                    System.out.print(i);
                    k++;
                    if( k >= amountOfNumbers ) break;//Прерывание внутреннего цикла, если нужное кол-во чисел выведено
                    System.out.print(",");// Дописывание запятой, это еще не последнее число
                }
            }
        }
    }
}