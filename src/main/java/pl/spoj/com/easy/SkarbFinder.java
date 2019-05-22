package pl.spoj.com.easy;

import java.util.Scanner;

public class SkarbFinder {
    public static void main(String[] args) {
        int d;
        d = sc.nextInt();
        for (; 0 < d; d--) {
            int n = sc.nextInt();
            int[] kierunek = new int[n];
            int[] ileKrokow = new int[n];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                kierunek[i] = a;
                ileKrokow[i] = b;

            }
            kierunek(kierunek, ileKrokow);
        }

    }

    private static void kierunek(int[] a, int[] b) {
        int polnoc = 0;
        int poludnie = 0;
        int zachod = 0;
        int wschod = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] == 0) {
                polnoc += b[j];
            } else if (a[j] == 1) {
                poludnie += b[j];
            } else if (a[j] == 2) {
                zachod += b[j];
            } else if (a[j] == 3) {
                wschod += b[j];
            }
        }


        if (polnoc > poludnie)
            System.out.println(0 + " " + (polnoc - poludnie));
        if (polnoc < poludnie)
            System.out.println(1 + " " + (poludnie - polnoc));
        if (zachod > wschod)
            System.out.println(2 + " " + (zachod - wschod));
        if (zachod < wschod)
            System.out.println(3 + " " + (wschod - zachod));
        if ((poludnie - polnoc) == 0 && (wschod - zachod) == 0)
            System.out.println("studnia");
    }

    private static Scanner sc = new Scanner(System.in);
}
