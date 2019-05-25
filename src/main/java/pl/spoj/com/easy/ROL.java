package pl.spoj.com.easy;

import java.util.Scanner;

public class ROL {
    public static void main(String[] args) {
        int t;
        t = sc.nextInt();
        for (; 0 < t; t--) {
            int n = sc.nextInt();
            int[] tab = new int[n];
            for (int i = 0; i < n; i++) {
                int liczby = sc.nextInt();
                tab[i] = liczby;
            }
            sort(tab);
        }
    }

    private static void sort(int[] tab) {
        int[] newTab = new int[tab.length];
        int firstElem = tab[0];
        for (int j = 0; j < newTab.length; j++) {
            if (j < newTab.length - 1) {
                newTab[j] = tab[j + 1];
            } else {
                newTab[j] = firstElem;
            }
        }
        for (int k = 0; k < tab.length; k++) {
            System.out.print(newTab[k] + " ");
        }
        System.out.println();
    }

    private static Scanner sc = new Scanner(System.in);
}
