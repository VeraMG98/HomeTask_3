package com.company;

public class Main {

    public static void main(String[] args) {
        float[] array = new float[15];
        float sum = 0;
        boolean proverka = false;
        int kol = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (-5 + Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (float i : array) {
            if (i < 0)
                proverka = true;

            if (proverka) {
                if (i > 0){
                    sum += i;
                    kol++;
                }
            }
        }

        if (kol == 0)
            System.out.println("Нет положительных элементов");
        else
            System.out.println("Сумма: " + sum + " Количество: " + kol + " Среднее арифметическое: " + sum/kol);


        for (int i = array.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    float var = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = var;
                }
                System.out.print(array[j] + " ");
            }
            System.out.println();
            //System.out.print(array[i] + " ");
        }
        for (float i : array) {
            System.out.print(i + " ");
        }
    }
}
