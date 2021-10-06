package ru.istu;

public class Sorter {
    public static int[] bubbleSort(int[] mas) {
        int[] helpMas = new int[mas.length];
        for (int i = 0; i < mas.length - 1; i++) {
           for (int j = 0; j < mas.length; j++) {
               if (mas[i] < mas[j]) {
                   int t = mas[i];
                   mas[i] = mas[j];
                   mas[j] = t;
               }
           }
        }
        return helpMas;
    }
}
