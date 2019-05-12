package pl.spoj.com.easy;

import java.util.Arrays;
import java.util.Scanner;

public class LiczbyPierwsze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        utwurzSito(10001);

        for (int i = 0; i < n; i++) {
            int liczba = scanner.nextInt();
            if (czyLiczbaPierwsza(liczba)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }

    private static boolean[] sito;

    private static void utwurzSito(int rozmiar) {
        sito = new boolean[rozmiar];
        Arrays.fill(sito, true);

        sito[0] = false;
        sito[1] = false;

        for (int i = 2; i < rozmiar; i++) {
            if (sito[i]) {
                for (int j = i + i; j < rozmiar; j += i) {
                    sito[j] = false;
                }
            }
        }
    }


    private static boolean czyLiczbaPierwsza(int liczba) {
        return sito[liczba];
    }
}
