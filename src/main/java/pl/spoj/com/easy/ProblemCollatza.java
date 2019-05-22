package pl.spoj.com.easy;

import java.util.Scanner;

public class ProblemCollatza {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(; 0 < t ; t--){
            int s = sc.nextInt();
            System.out.println(wynikCiagu(s));
        }
    }

    private static int wynikCiagu(int s){
        int n = 0;
        while (s != 1){
            if (s % 2 == 0){
                s /= 2;
                n++;
            } else{
                s = (s*3) + 1;
                n++;
            }
        }
        return n;
    }
}
