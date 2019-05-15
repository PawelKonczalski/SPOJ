package pl.spoj.com.easy;

import java.util.Scanner;

public class CzyUmieszPotegowac {
    public static void main(String[] args) {
        int d;
        Scanner scanner = new Scanner(System.in);
        d = scanner.nextInt();

        for (int i = 0; i < d; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int wynik = potegowanie(a, b);
            int jednosci = wynik % 10;
            System.out.println(jednosci);
        }
    }

    private static int potegowanie(int a, int b) {
        if (a == 1 || a % 10 == 1) {
            return 1;
        }
        if (a == 2 || a % 10 == 2) {
            if (b == 1 || b % 4 == 1)
                return 2;
            if (b == 2 || b % 4 == 2)
                return 4;
            if (b == 3 || b % 4 == 3)
                return 8;
            if (b % 4 == 0)
                return 6;
        }
        if (a == 3 || a % 10 == 3) {
            if (b == 1 || b % 4 == 1)
                return 3;
            if (b == 2 || b % 4 == 2)
                return 9;
            if (b == 3 || b % 4 == 3)
                return 7;
            if (b % 4 == 0)
                return 1;
        }
        if (a == 4 || a % 10 == 4) {
            if (b == 1 || b % 4 == 1)
                return 4;
            if (b == 2 || b % 4 == 2)
                return 6;
            if (b == 3 || b % 4 == 3)
                return 4;
            if (b % 4 == 0)
                return 6;
        }
        if (a == 5 || a % 10 == 5) {
            return 5;
        }
        if (a == 6 || a % 10 == 6) {
            return 6;
        }
        if (a == 7 || a % 10 == 7) {
            if (b == 1 || b % 4 == 1)
                return 7;
            if (b == 2 || b % 4 == 2)
                return 9;
            if (b == 3 || b % 4 == 3)
                return 3;
            if (b % 4 == 0)
                return 1;
        }
        if (a == 8 || a % 10 == 8) {
            if (b == 1 || b % 4 == 1)
                return 8;
            if (b == 2 || b % 4 == 2)
                return 4;
            if (b == 3 || b % 4 == 3)
                return 2;
            if (b % 4 == 0)
                return 6;
        }
        if (a == 9 || a % 10 == 9) {
            if (b % 2 == 0)
                return 1;
            else
                return 9;
        } else {
            return 0;
        }
    }
}
