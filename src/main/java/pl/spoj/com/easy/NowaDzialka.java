package pl.spoj.com.easy;

import java.util.Scanner;

public class NowaDzialka {
    public static void main(String[] args) {
        int d = sc. nextInt();
        for(; 0 < d; d--){
            int x = sc.nextInt();
            System.out.println(powierzchniaKwadratowaDzialki(x));
        }
    }

    private static int powierzchniaKwadratowaDzialki(int x){
        return x*x;
    }

    private static Scanner sc = new Scanner(System.in);
}
