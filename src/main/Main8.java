package main;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        int weight = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                int a = input.charAt(i);
                System.out.print(a + " + ");
                weight += a;
            }

        }
        System.out.println("=" + weight);
    }
}
