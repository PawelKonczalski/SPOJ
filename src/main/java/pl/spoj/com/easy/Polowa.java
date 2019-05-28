package pl.spoj.com.easy;

import java.util.Scanner;

public class Polowa {
    public static void main(String[] args) {
        int t = sc.nextInt();
        for(; 0 < t; t--){
            String napis = sc.next();
            System.out.println(polowaNapisu(napis));
        }
    }

    private static StringBuilder polowaNapisu(String napis){
        char[] tabNapis = napis.toCharArray();
        StringBuilder rezultat = new StringBuilder();
        for (int i = 0; i < tabNapis.length/2; i++) {
            rezultat.append(tabNapis[i]);
        }
        return rezultat;
    }

    private static Scanner sc = new Scanner(System.in);
}
