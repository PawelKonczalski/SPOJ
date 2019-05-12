package pl.spoj.com.easy;

import java.util.Scanner;

public class NWD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        for (int i = 0; i < liczba ; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(nwd(a, b));
        }
    }

    private static int nwd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}