package pl.spoj.com.easy;

import java.util.Scanner;

public class ReprezentacjaLiczbTypuFloat {
    public static void main(String[] args) {
        int t;
        float liczba;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            liczba = scanner.nextFloat();
            printfloat(liczba);
        }
    }

    private static void printfloat(float t) {
        String hex = Integer.toHexString(Float.floatToIntBits(t));
        char[] tab = hex.toCharArray();
        StringBuilder wynik = new StringBuilder();
        for (int i = 0; i < tab.length; i += 2) {
            if (tab.length == 1) {
                wynik.append("0 0 0 0");
            } else if (tab[i] == '0' && tab[i + 1] == '0') {
                wynik.append(tab[i]).append(" ");
            } else if (tab[i] == '0') {
                wynik.append(tab[i + 1]).append(" ");
            } else {
                wynik.append(tab[i]).append(tab[i + 1]).append(" ");
            }
        }
        System.out.println(wynik);
    }
}
