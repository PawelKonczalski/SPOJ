package pl.spoj.com.easy;

import java.util.Scanner;

public class ProsteDodawanie {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t;
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            System.out.println(prosteDodawanie(a));
        }
    }

    private static int prosteDodawanie(int a) {
        int[] tab = new int[a];
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            int b = scanner.nextInt();
            tab[i] = b;
            wynik += tab[i];
        }
        return wynik;
    }
}
