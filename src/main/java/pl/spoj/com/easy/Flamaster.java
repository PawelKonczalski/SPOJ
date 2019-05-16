package pl.spoj.com.easy;

import java.util.Scanner;

public class Flamaster {
    public static void main(String[] args) {
        int c;
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();

        for (int i = 0; i < c; i++) {
            String napis = scanner.next();
            napis(napis);
        }
    }

    private static void napis(String napis) {

        char[] tablicaNapisow = napis.toCharArray();
        int ile;
        int marker = 0;
        StringBuilder wynik = new StringBuilder();

        while (marker < napis.length()) {
            ile = 1;
            char aktualnyZnak = tablicaNapisow[marker];
            marker++;

            for (; marker < napis.length() && tablicaNapisow[marker] == aktualnyZnak; marker++) {
                ile++;
            }

            if(ile == 1)
                wynik.append(aktualnyZnak);
            else if (ile == 2){
                wynik.append(aktualnyZnak);
                wynik.append(aktualnyZnak);
            }
            else {
                wynik.append(aktualnyZnak).append(ile);
            }
        }
        System.out.println(wynik);
    }
}