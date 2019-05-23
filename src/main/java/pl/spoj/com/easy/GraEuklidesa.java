package pl.spoj.com.easy;

import java.util.Scanner;

public class GraEuklidesa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(; 0 < t ; t--){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(eulides(a, b));
        }
    }

    private static int eulides(int a, int b){
        int pozostaleZetony;
        if (a == b){
            pozostaleZetony = a + b;
        } else {
            while (a != b){
                if (a > b){
                    a -= b;
                } else {
                    b -= a;
                }
            }
            pozostaleZetony = a + b;
        }
        return pozostaleZetony;
    }
}
