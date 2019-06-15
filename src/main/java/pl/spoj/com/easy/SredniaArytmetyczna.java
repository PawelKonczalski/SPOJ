package pl.spoj.com.easy;

import java.util.Scanner;

public class SredniaArytmetyczna {
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (; 0 < t; t--) {
            int n = sc.nextInt();
            int[] tab = new int[n];
            for (int i = 0; i < tab.length; i++) {
                tab[i] = sc.nextInt();
            }
            srednia(tab);
        }
    }

    private static void srednia(int[] tab) {
        double suma = 0;
        double srednia;
        int index = 0;

        for (double value : tab) {
            suma += value;
        }

        srednia = (suma / tab.length);

        double[] newTab = new double[tab.length];
        double najmniejszyElement = tab[0] - srednia;
        for (int i = 0; i < tab.length; i++) {
            newTab[i] = tab[i] - srednia;
        }

        for (int j = 0; j < newTab.length; j++) {
            if (Math.abs(najmniejszyElement) > Math.abs(newTab[j])) {
                najmniejszyElement = newTab[j];
                index = j;
            }
        }
        System.out.println(tab[index]);
    }

    private static Scanner sc = new Scanner(System.in);
}