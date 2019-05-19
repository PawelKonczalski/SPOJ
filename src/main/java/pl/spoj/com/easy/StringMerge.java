package pl.spoj.com.easy;

import java.util.Scanner;

public class StringMerge {
    public static void main(String[] args) {
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String napis1 = scanner.next();
            String napis2 = scanner.next();
            string_merge(napis1, napis2);
        }
    }

    private static void string_merge(String napis1, String napis2) {
        char[] napisPierwszy = napis1.toCharArray();
        char[] napisDrugi = napis2.toCharArray();
        int krotszyNapis;
        int marker = 0;
        char nowyNapis1;
        char nowyNapis2;
        StringBuilder wynik = new StringBuilder();

        if (napis1.length() >= napis2.length()) {
            krotszyNapis = napis2.length();
        } else {
            krotszyNapis = napis1.length();
        }

        while (marker < krotszyNapis) {
            nowyNapis1 = napisPierwszy[marker];
            nowyNapis2 = napisDrugi[marker];
            wynik.append(nowyNapis1).append(nowyNapis2);
            marker++;
        }

        System.out.println(wynik);
    }
}
