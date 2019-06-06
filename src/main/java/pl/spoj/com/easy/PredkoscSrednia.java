package pl.spoj.com.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PredkoscSrednia {
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for (; 0 < t; t--) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(wyznaczeniePredkosciSredniej(A, B));
        }
    }

    private static int wyznaczeniePredkosciSredniej(int A, int B) {
        return (2 * A * B) / (A + B);
    }

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
}
