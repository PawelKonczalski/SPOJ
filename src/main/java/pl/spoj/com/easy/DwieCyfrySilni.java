package pl.spoj.com.easy;

import java.util.Scanner;

public class DwieCyfrySilni {
    public static void main(String[] args) {
        int d;
        Scanner scanner = new Scanner(System.in);
        d = scanner.nextInt();

        for (int i = 1; i <= d; i++) {
            int n = scanner.nextInt();
            int wynik = silnia(n);
            int jednosci = wynik%10;
            int dziesiatki = wynik%(100)/10;
            System.out.println(dziesiatki + " " + jednosci);
        }
    }

    private static int silnia(int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return 1;
        else if (n > 1 && n < 10)
            return n * silnia(n - 1);
        else return 0;
    }
}
