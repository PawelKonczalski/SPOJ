package pl.spoj.com.easy;

import java.util.Scanner;

public class Tablice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] tab = new int[n];
            for (int j = 0; j < tab.length; j++) {
                n = scanner.nextInt();
                tab[j] = n;
            }
            for (int j = tab.length-1; j >= 0; j--) {
                System.out.print(tab[j] + " ");
            }
        }
    }
}


