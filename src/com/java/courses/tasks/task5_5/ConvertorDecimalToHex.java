package com.java.courses.tasks.task5_5;

public class ConvertorDecimalToHex {

    public static void main (String[] args) {
        convert(4096);
    }

    public static void convert (int decNumber) {
        int a[] = new int[32]; //  массив разрядов двоичного числа
        int[] hexDigits = new int[8];// массив разрядов шестнадцатиричного числа
        int l = 7;
         /*Цикл для перевода из дсятичного в двоичное число*/
        for(int i = 0; i < 32; i++){
            int k = decNumber % 2;
            a[i] = k;
            decNumber/= 2;
        }
         /*Цикл для перевода каждых четырех разрядов двоичного числа(всего 32 разряда) в разряд шестнадцатиричного*/
        for (int q = 0; q < 8; q++) {
            for (int j = 0 ; j < 4 ; j++) {
                if (a[j + 4 * q] == 1) {
                    hexDigits[q] += (int) (Math.pow(2, j));
                }
            }
        }
         /*цикл для отбрасывания нулей в старших разрядах(l - номер послднего разряда, который выведется в консоль)*/
        while (hexDigits[l]==0) l--;
        /*цикл вывода в консоль)*/
        while (l >= 0){
            if (hexDigits[l] < 10) {
                System.out.print(Integer.toString(hexDigits[l]));
            } else if (hexDigits[l] == 10) {
                System.out.print("A");
            } else if (hexDigits[l] == 11) {
                System.out.print("B");
            } else if (hexDigits[l] == 12) {
                System.out.print("C");
            } else if (hexDigits[l] == 13) {
                System.out.print("D");
            } else if (hexDigits[l] == 14) {
                System.out.print("E");
            } else if (hexDigits[l] == 15) {
                System.out.print("F");
            }
            l--;
        }
    }
}

