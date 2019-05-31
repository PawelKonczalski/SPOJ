package pl.spoj.com.easy;

import java.util.Scanner;

public class CiazowySpecjalista {
    public static void main(String[] args) {
        int d = sc.nextInt();
        for (; 0 < d; d--) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            System.out.println(dlugoscCiazy(x, y, z));
        }
    }

    private static long dlugoscCiazy(double x, double y, double z) {
        return Math.round(((z * y - x - y) / (1 - z)) * (-12));
    }

    private static Scanner sc = new Scanner(System.in);
}

