package main;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        int upperWeight = 0;
        int lowerWeight = 0;
        int absoluteWeight = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                int a = input.charAt(i);
                upperWeight += a;
            } else if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                int b = input.charAt(i);
                lowerWeight += b;
            }
            absoluteWeight = upperWeight - lowerWeight;
        }
        System.out.println(upperWeight + "-" + lowerWeight + "=" + absoluteWeight);
    }
}
