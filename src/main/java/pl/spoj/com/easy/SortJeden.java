package pl.spoj.com.easy;

import java.util.Scanner;

public class SortJeden {
    public static void main(String[] args) {
        int t;
        t = sc.nextInt();
        for (; 0 < t; t--) {
            int iloscPunktow = sc.nextInt();
            String[] nazwaTab = new String[iloscPunktow];
            int[] xTab = new int[iloscPunktow];
            int[] yTab = new int[iloscPunktow];
            for (int i = 0; i < iloscPunktow; i++) {
                String punkt = sc.next();
                int x = sc.nextInt();
                int y = sc.nextInt();
                nazwaTab[i] = punkt;
                xTab[i] = x;
                yTab[i] = y;
            }
            sortJeden(nazwaTab, xTab, yTab);
        }
    }

    private static void sortJeden(String[] punkt, int[] punktX, int[] punktY) {
        double[] odleploscPunktu = new double[punkt.length];
        for (int j = 0; j < punkt.length; j++) {
            odleploscPunktu[j] = Math.sqrt(Math.pow(punktX[j], 2) + Math.pow(punktY[j], 2));
        }

        int tempX;
        int tempY;
        String tempPunkt;
        double tempOdleglosc;
        int zmiana = 1;
        while (zmiana > 0) {
            zmiana = 0;
            for (int k = 0; k < punkt.length - 1; k++) {
                if (odleploscPunktu[k] > odleploscPunktu[k + 1]) {
                    tempOdleglosc = odleploscPunktu[k + 1];
                    odleploscPunktu[k + 1] = odleploscPunktu[k];
                    odleploscPunktu[k] = tempOdleglosc;
                    tempPunkt = punkt[k + 1];
                    punkt[k + 1] = punkt[k];
                    punkt[k] = tempPunkt;
                    tempX = punktX[k + 1];
                    punktX[k + 1] = punktX[k];
                    punktX[k] = tempX;
                    tempY = punktY[k + 1];
                    punktY[k + 1] = punktY[k];
                    punktY[k] = tempY;
                    zmiana++;
                }
            }
        }

        for (int l = 0; l < punkt.length; l++) {
            System.out.println(punkt[l] + " " + punktX[l] + " " + punktY[l]);
        }
        System.out.println();
    }

    private static Scanner sc = new Scanner(System.in);
}
