package pl.spoj.com.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Niekolejne {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] tab = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            tab[i] = i;
        }
        niekolejneWyswitlenie(tab);
    }

    private static void niekolejneWyswitlenie(int[] tab) {
        StringBuilder sb = new StringBuilder();
        int indexPierwszaCzescTabeli = 1;
        int indexDrugaCzescTabeli;

        if (tab.length % 2 == 0)
            indexDrugaCzescTabeli = tab.length / 2 + 1;
        else
            indexDrugaCzescTabeli = tab.length / 2 + 2;

        for (int i = 0; i < tab.length; i++) {
            if (tab.length == 1) {
                sb.append(0);
                break;
            } else if (tab.length == 2 || tab.length == 3) {
                sb.append("NIE");
                break;
            } else if (tab.length == 4) {
                sb.append("1 3 0 2");
                break;
            } else if (i % 2 == 0) {
                sb.append(tab[indexPierwszaCzescTabeli]).append(" ");
                indexPierwszaCzescTabeli++;
            } else if (indexDrugaCzescTabeli < tab.length) {
                sb.append(tab[indexDrugaCzescTabeli]).append(" ");
                indexDrugaCzescTabeli++;
            } else sb.append("0").append(" ");
        }

        System.out.print(sb);
    }

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
}
// PROGRAM PRZEPISANY DO C++ Z POWODU ZBYT WOLNEGO DZIALANIA