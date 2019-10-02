package main;

public class Main1 {
    public static void main(String[] args) {
        String hello = "Hello";
        System.out.print("Index: ");
        for (int i = 0; i < hello.length(); i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\n");
        System.out.print("Chars: ");
        for (int i = 0; i < hello.length(); i++) {
            System.out.print(hello.charAt(i) + "\t");

        }
    }
}
