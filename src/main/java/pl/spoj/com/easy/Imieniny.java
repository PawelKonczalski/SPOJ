package pl.spoj.com.easy;

import java.util.Scanner;

public class Imieniny {
    public static void main(String[] args) {
        int d = sc.nextInt();
        for (; 0 < d; d--) {
            int l = sc.nextInt();
            int c = sc.nextInt();
            czyCosZostanie(l, c);
        }
    }

    private static void czyCosZostanie(int l, int c) {
        if (c >= (l-1)) {
            if(c == 0)
                System.out.println("NIE");
            else if((l-1)==0 || l == 0)
                System.out.println("TAK");
            else if(c%(l-1) == 0)
                System.out.println("NIE");
            else
                System.out.println("TAK");
        } else
            System.out.println("TAK");
    }

    private static Scanner sc = new Scanner(System.in);
}
