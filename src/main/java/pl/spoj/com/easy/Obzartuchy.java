package pl.spoj.com.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Obzartuchy {
    public static void main(String[] args) throws IOException {
        int t;
        t = Integer.parseInt(br.readLine());
        for (; 0 < t; t--) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            System.out.println(glutton(N, M));
        }
    }

    private static int glutton(int N, int M) throws IOException {
        int ileCieastekWDobe = 0;

        for (; 0 < N; N--) {
            int czasJedzenia = Integer.parseInt(br.readLine());
            ileCieastekWDobe += (86400 / czasJedzenia);
        }

        if (ileCieastekWDobe % M == 0) {
            return ileCieastekWDobe / M;
        } else {
            return ileCieastekWDobe / M + 1;
        }
    }

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
}