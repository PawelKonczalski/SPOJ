package pl.spoj.com;

import java.util.Scanner;

public class Przedszkolanka {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int wynik = (a*b)/nwd(a, b);
            System.out.println(wynik);
        }
    }

    private static int nwd(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }
}
