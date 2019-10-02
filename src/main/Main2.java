package main;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        int beginningIndex = scanner.nextInt();
        int endingIndex = scanner.nextInt();
        System.out.println(input.substring(beginningIndex, endingIndex));
    }
}
