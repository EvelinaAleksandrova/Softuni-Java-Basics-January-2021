package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int n = 1;
        while (n <= number) {
            System.out.println(n);
            n = n * 2 + 1;
        }
    }
}
