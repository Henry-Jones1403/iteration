package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your number");
        int number = input.nextInt();
        for (int i = 0; i <number ; i++) {
            String sequence= "";
            for (int j = i; j < (i + (number)); j++) {
                sequence = sequence + j;

            }System.out.println(sequence);

        }

    }
}

