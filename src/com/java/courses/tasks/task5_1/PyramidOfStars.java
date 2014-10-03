package com.java.courses.tasks.task5_1;

public class PyramidOfStars {
    public static void main(String args[]) {
        drawPiramid(5);
    }

    public static void drawPiramid(int numOfLines) {
        int k = 0;
        //цикл строк, где b - номер строки
        for (int b = 0; b < numOfLines; b++) {
            k++;        // количество звездочек в текущей строке
                /*цикл вывода пробелов и звездочек в строке*/
            for (int numOfspaces = 0; numOfspaces < numOfLines; numOfspaces++) {
                if (numOfspaces < numOfLines - k) System.out.print(' ');
                if (numOfspaces == numOfLines - k){
                        /*цикл вывода звездочек кроме последней в каждой строке*/
                    for (int numOfRisks = 0; numOfRisks < 2 * (k-1); numOfRisks++) {
                        System.out.print('*');
                    }
                    System.out.println('*'); //  вывод последней звездочки с переносом строки
                }
            }
        }
    }
}