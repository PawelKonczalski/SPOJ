package pl.spoj.com.easy;

import java.util.Scanner;

public class Stos {
    public static void main(String[] args) {
        int[] stos = new int[10];
        int liczbaStos;
        int index = 0;
        while (sc.hasNext()) {
            String operacja = sc.nextLine();
            if (operacja.equals("+")) {
                liczbaStos = sc.nextInt();
                if(index < stos.length) {
                    stos[index] = liczbaStos;
                    System.out.println(":)");
                    index++;
                }else {System.out.println(":(");}
            }

            if (operacja.equals("-") && index > 0) {
                System.out.println(stos[index - 1]);
                index--;
            }

            else if(operacja.equals("-")) {
                System.out.println(":(");
            }
        }

    }

    private static Scanner sc = new Scanner(System.in);
}
