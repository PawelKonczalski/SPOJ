package pl.spoj.com.easy;

import java.util.Scanner;

public class Pesel {
    public static void main(String[] args) {
        int n = sc.nextInt();
        for (; 0 < n; n--) {
            String pesel = sc.next();
            czyPrawidlowy(pesel);
        }
    }

    private static void czyPrawidlowy(String pesel) {
        char[] pesrlTab = pesel.toCharArray();
        int suma = 0;
        for (int i = 0; i < pesrlTab.length; i++) {
            if (i == 0 || i == 4 || i == 8 || i == 10) {
                suma += (pesrlTab[i]);
            } else if (i == 1 || i == 5 || i == 9) {
                suma += (pesrlTab[i] * 3);
            } else if (i == 2 || i == 6) {
                suma += (pesrlTab[i] * 7);
            } else if (i == 3 || i == 7) {
                suma += (pesrlTab[i] * 9);
            }
        }
        if (suma % 10 == 0)
            System.out.println("D");
        else
            System.out.println("N");
    }

    private static Scanner sc = new Scanner(System.in);
}
