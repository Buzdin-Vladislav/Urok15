package org.example;
/**
2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        и числа меньшие 6 умножить на 2;
 */
public class dz2 {
    public static void dz2 (int[] args) {
    int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    for (int i = 0; i < a.length; i++) {
if (a[i] < 5) {
    a[i] *=2;
}
    }


}}

