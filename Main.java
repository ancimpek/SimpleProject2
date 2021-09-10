package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int num1;
//        int num2;
//        int result;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = s.nextInt();

        System.out.println("Enter the number 2");
        int num2 = s.nextInt();
        s.close();

        int result = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, result);
    }
}
