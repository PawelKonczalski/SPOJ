package pl.spoj.com.easy;

import java.util.Scanner;

public class ParzysteNieparzyste {
    public static void main(String[] args) {
        int t = sc.nextInt();
        for(; 0 < t; t--){
            int n = sc.nextInt();
            int[] tab =  new int[n];
            for (int i = 0; i < tab.length; i++) {
                tab[i] = sc.nextInt();
            }
            wyswietl(tab);
        }
    }

    private static void wyswietl(int[] tab){
        StringBuilder nieparzyste = new StringBuilder();
        StringBuilder parzyste = new StringBuilder();

        for (int j = 0; j < tab.length; j++) {
        if(j % 2 != 0){
            nieparzyste.append(tab[j]).append(" ");
        }
        else
            parzyste.append(tab[j]).append(" ");
        }

        nieparzyste.append(parzyste);
        System.out.println(nieparzyste);
    }

    private static Scanner sc = new Scanner(System.in);
}
