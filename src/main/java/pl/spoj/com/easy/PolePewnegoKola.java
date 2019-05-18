package pl.spoj.com.easy;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class PolePewnegoKola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double r = scanner.nextDouble();
            double d = scanner.nextDouble();

            DecimalFormat decimalFormat = new DecimalFormat("####.##");
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator('.');
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);

            System.out.println(decimalFormat.format(pole(r,d)));
    }

    private static double pole(double r, double d) {
        double nowyPromien;
        double S;
        nowyPromien = Math.sqrt((r * r) - ((d * d) / 4));
        S = Math.PI*(Math.pow(nowyPromien,2));
        return S;
    }
}

