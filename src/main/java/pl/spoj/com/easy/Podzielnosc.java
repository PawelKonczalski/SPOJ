package pl.spoj.com.easy;

import java.util.Scanner;

public class Podzielnosc {
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (; 0 < t; t--) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(liczbySpelniajaceWarunek(n, x, y));
        }
    }

    private static StringBuilder liczbySpelniajaceWarunek(int n, int x, int y) {
        StringBuilder sb = new StringBuilder();
        int krok = x;
        while (x < n) {
            if (x % y != 0) {
                sb.append(x).append(" ");
            }
            x += krok;
        }
        return sb;
    }

    private static Scanner sc = new Scanner(System.in);
}
