package main;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        char word = scanner.next().charAt(0);
        scanner.close();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == word) {
                    System.out.println(i);
                    break;
                }

            }
        }


    }

