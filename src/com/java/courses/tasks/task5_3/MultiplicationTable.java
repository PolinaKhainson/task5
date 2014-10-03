package com.java.courses.tasks.task5_3;

public class MultiplicationTable {
    public static void main(String[] args) {
        getMultiplicationTable();
    }

    public static void getMultiplicationTable(){
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        /*Цикл Для верхних четырех столбцов - таблица двойки, тройки, четверки и пятерки*/
        for(int j:a){
            for(int i = 2;i < 6;i++) {
                    /*if для разного количества пробелов при выводе, в зависимости от количества разрядов в числах*/
                if (i*j < 10 && j != 10) {
                    System.out.print( i + "*"  + j + " =" + " " + i * j + "    ");//все три числа < 10
                } else if (i*j >= 10 && j != 10){
                    System.out.print(i + "*" + j + " =" + i * j + "    ");//множимое и множитель < 10,произведение больше
                } else {
                    System.out.print(i + "*" + j + "=" + i * j + "    ");//множитель и произведение > 10
                }
            }
            System.out.println("");
        }
        System.out.println("");
        /*Цикл Для нижних четырех столбцов - таблица двойки, тройки, четверки и пятерки*/
        for(int j:a){
            for(int i = 6;i < 10;i++) {
                /*if для разного количества пробелов при выводе, в зависимости от количества разрядов в числах*/
                if (i*j < 10 && j != 10) {
                    System.out.print( i + "*"  + j + " =" + " " + i * j + "    ");
                } else if (i*j >= 10 && j != 10){
                    System.out.print(i + "*" + j + " =" + i * j + "    ");
                } else {
                    System.out.print(i + "*" + j + "=" + i * j + "    ");
                }
            }
            System.out.println("");
        }


    }
}
