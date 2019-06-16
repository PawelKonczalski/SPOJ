package pl.spoj.com.easy;

import java.util.Scanner;

public class SystemyPozycyjne {
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (; 0 < t; t--) {
            int liczba = sc.nextInt();
            System.out.println(szesnastkowy(liczba) + " " + jedenastkowym(liczba));
        }
    }

    private static StringBuilder szesnastkowy(int liczba) {
        StringBuilder sb = new StringBuilder();
        int systemSzesnastkowy = liczba;
        while (systemSzesnastkowy != 0) {
            int reszta = systemSzesnastkowy % 16;
            if (reszta == 10) {
                sb.append("A");
            }
            if (reszta == 11) {
                sb.append("B");
            }
            if (reszta == 12) {
                sb.append("C");
            }
            if (reszta == 13) {
                sb.append("D");
            }
            if (reszta == 14) {
                sb.append("E");
            }
            if (reszta == 15) {
                sb.append("F");
            }
            if (reszta < 10 && systemSzesnastkowy > 0) {
                sb.append(reszta);
            }
            systemSzesnastkowy /= 16;
        }
        return sb.reverse();
    }

    private static StringBuilder jedenastkowym(int liczba) {
        StringBuilder sb = new StringBuilder();
        int systemJedenastkowym = liczba;
        while (systemJedenastkowym != 0) {
            int reszta = systemJedenastkowym % 11;
            if (reszta == 10) {
                sb.append("A");
            }
            if (reszta < 10 && systemJedenastkowym > 0) {
                sb.append(reszta);
            }
            systemJedenastkowym /= 11;

        }
        return sb.reverse();
    }


    private static Scanner sc = new Scanner(System.in);
}
