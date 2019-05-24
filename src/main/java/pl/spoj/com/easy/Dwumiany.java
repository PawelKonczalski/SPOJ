package pl.spoj.com.easy;

import java.util.Scanner;

public class Dwumiany {
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (; 0 < t; t--) {
            int n = sc.nextInt();
            int k = sc.nextInt();
           newton(n, k);
        }
    }

    private static void newton(int n, int k) {
        double wynik = 1;
        for (int i = 1; i <= k; i++) {
            wynik = (wynik * (n - i + 1))/i;
        }
        System.out.println(Math.round(wynik));
    }

    private static Scanner sc = new Scanner(System.in);
}
