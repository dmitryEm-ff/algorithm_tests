package ru.job4j.arrays;

public class Divider {
    public static boolean check(int num, int[] ints) {
        for (int i : ints) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }
}
