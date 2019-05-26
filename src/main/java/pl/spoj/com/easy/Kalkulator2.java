package pl.spoj.com.easy;

import java.util.Scanner;

public class Kalkulator2 {
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
            case "z":
                pamiec[liczbaJeden] = liczbaDwa;
                break;
            case "+":
                wynik = pamiec[liczbaJeden] + pamiec[liczbaDwa];
                System.out.println(wynik);
                break;
            case "-":
                wynik = pamiec[liczbaJeden] - pamiec[liczbaDwa];
                System.out.println(wynik);
                break;
            case "*":
                wynik = pamiec[liczbaJeden] * pamiec[liczbaDwa];
                System.out.println(wynik);
                break;
            case "/":
                wynik = pamiec[liczbaJeden] / pamiec[liczbaDwa];
                System.out.println(wynik);
                break;
            case "%":
                wynik = pamiec[liczbaJeden] % pamiec[liczbaDwa];
                System.out.println(wynik);
                break;
        }
    }

    private static int[] pamiec = new int[10];

    private static Scanner sc = new Scanner(System.in);
}
