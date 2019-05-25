package pl.spoj.com.easy;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        while (sc.hasNext()) {
            String operacja = sc.next();
            int liczbaJeden = sc.nextInt();
            int liczbaDwa = sc.nextInt();
            kalkulator(operacja, liczbaJeden, liczbaDwa);
        }
    }

    private static void kalkulator(String operacja, int liczbaJeden, int liczbaDwa) {
        int wynik;
        switch (operacja) {
            case "+":
                wynik = liczbaJeden + liczbaDwa;
                System.out.println(wynik);
                break;
            case "-":
                wynik = liczbaJeden - liczbaDwa;
                System.out.println(wynik);
                break;
            case "*":
                wynik = liczbaJeden * liczbaDwa;
                System.out.println(wynik);
                break;
            case "/":
                wynik = liczbaJeden / liczbaDwa;
                System.out.println(wynik);
                break;
            case "%":
                wynik = liczbaJeden % liczbaDwa;
                System.out.println(wynik);
                break;
        }
    }

    private static Scanner sc = new Scanner(System.in);
}
