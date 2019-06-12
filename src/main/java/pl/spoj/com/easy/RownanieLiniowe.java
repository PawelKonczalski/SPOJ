package pl.spoj.com.easy;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class RownanieLiniowe {
    public static void main(String[] args) {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        rozwiazanieRownania(a, b, c);
    }

    private static void rozwiazanieRownania(double a,double b,double c){
        if(a==0 && b == c){
            System.out.println("NWR");
        } else if(a==0)
            System.out.println("BR");
        else {
            double wynik = (c - b)/a;

            DecimalFormat df = new DecimalFormat("###0.00");
            DecimalFormatSymbols dfs = df.getDecimalFormatSymbols();
            dfs.setDecimalSeparator('.');
            df.setDecimalFormatSymbols(dfs);

            System.out.println(df.format(wynik));
        }
    }

    private static Scanner sc = new Scanner(System.in);
}
