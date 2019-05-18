package pl.spoj.com.easy;

import java.util.Scanner;

public class ZabawneDodawaniePiotrusia {

    public static void main(String[] args) {

        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = scanner.nextInt();
            palindrom(n);
        }
    }

    private static void palindrom(int n) {
        int przekazana = n;
        int odwrocona = 0;
        int proba = 0;

        while (przekazana > 0) {
            odwrocona = odwrocona * 10 + przekazana % 10;
            przekazana = przekazana / 10;
        }

        while (n != odwrocona) {
            n += odwrocona;
            przekazana = n;
            odwrocona = 0;
            while (przekazana > 0) {
                odwrocona = odwrocona * 10 + przekazana % 10;
                przekazana = przekazana / 10;
            }
            proba++;
        }

        System.out.println(n + " " + proba);

    }

}
