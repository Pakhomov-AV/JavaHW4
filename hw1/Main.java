package hw1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начать список с числа:");
        int n = scanner.nextInt();
        System.out.println("Длина списка:");
        int l = scanner.nextInt();
        scanner.close();
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = n; i < n + l; i++) {
            ls.add(i);
        }

        for (int i = 0; i < ls.size() - 1; i++) {
            int temp = ls.pollLast();
            ls.add(i, temp);
        }
        System.out.println(ls);
    }
}