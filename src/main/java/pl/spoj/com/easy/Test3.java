package pl.spoj.com.easy;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int wyjscie = 1;
        int liczba;
        while (sc.hasNext()) {
            if (wyjscie < 3) {
                liczba = sc.nextInt();
                System.out.println(liczba);
                if (liczba != 42) {
                    liczba = sc.nextInt();
                    if (liczba == 42) {
                        wyjscie++;
                        System.out.println(liczba);
                    } else {
                        System.out.println(liczba);
                    }
                }
            } else {
                liczba = sc.nextInt();
            }
        }
    }

    private static Scanner sc = new Scanner(System.in);
}
