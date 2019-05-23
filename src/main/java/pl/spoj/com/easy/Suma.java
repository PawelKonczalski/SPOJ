package pl.spoj.com.easy;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        int wynik = 0;
        while (sc.hasNext()) {
            wynik += sc.nextInt();
            System.out.println(wynik);
        }

    }
    private static Scanner sc = new Scanner(System.in);
}
