package pl.spoj.com.easy;

import java.util.Scanner;

public class RownanieKwadratowe {
    public static void main(String[] args) {
        while (sc.hasNext()) {
            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = sc.nextDouble();
            System.out.println(liczbaRozwiazan(A, B, C));
        }
    }

    private static int liczbaRozwiazan(double A, double B, double C){
        double delta = (Math.pow(B, 2)) - (4 * A * C);
        if (delta > 0)
            return 2;
        else if(delta == 0)
            return 1;
        else
            return 0;
    }

    private static Scanner sc = new Scanner(System.in);
}
