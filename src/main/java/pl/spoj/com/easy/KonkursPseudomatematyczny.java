package pl.spoj.com.easy;

import java.util.Scanner;

public class KonkursPseudomatematyczny {
    public static void main(String[] args) {
        int d = sc.nextInt();
        for (; 0 < d; d--) {
            int n = sc.nextInt();
            int[] tabWynikow = new int[n];
            for (int i = 0; i < tabWynikow.length; i++) {
                tabWynikow[i] = sc.nextInt();
            }
            podium(tabWynikow);
        }
    }

    private static void podium(int[] tabWynikow) {
        int[] tabPodium = new int[tabWynikow.length];
        int index = 0;

        int zmiana = 1;
        int temp;
        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < tabWynikow.length - 1; i++) {
                if (tabWynikow[i] > tabWynikow[i + 1]) {
                    temp = tabWynikow[i + 1];
                    tabWynikow[i + 1] = tabWynikow[i];
                    tabWynikow[i] = temp;
                    zmiana++;
                }
            }
        }

        int najwiekszyWynik = tabWynikow[0];
        for (int punkty : tabWynikow) {
            if (najwiekszyWynik < punkty) {
                najwiekszyWynik = punkty;
            }
        }

        for (int j = 0; j < tabPodium.length; j++) {
            if (tabWynikow[j] == najwiekszyWynik) {
                tabPodium[index] = najwiekszyWynik;
                index++;
            }
        }

        for (int k = 0; k < tabPodium.length; k++) {
            if (tabWynikow[k] != najwiekszyWynik) {
                tabPodium[index] = tabWynikow[k];
                index++;
            }
        }

        for (int podium : tabPodium) {
            System.out.print(podium + " ");
        }
        System.out.println();
    }

    private static Scanner sc = new Scanner(System.in);
}
