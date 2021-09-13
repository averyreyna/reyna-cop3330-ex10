/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // inputs 1-6 contains the user's information about their items
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        double inputPrice1 = Integer.parseInt(input.nextLine());

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 1: ");
        int inputQuantity1 = Integer.parseInt(input2.nextLine());

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the price of item 2: ");
        double inputPrice2 = Integer.parseInt(input3.nextLine());

        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 2: ");
        int inputQuantity2 = Integer.parseInt(input4.nextLine());

        Scanner input5 = new Scanner(System.in);
        System.out.print("Enter the price of item 3: ");
        double inputPrice3 = Integer.parseInt(input5.nextLine());

        Scanner input6 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 3: ");
        int inputQuantity3 = Integer.parseInt(input6.nextLine());

        // math for calculating totals, with the 5.5% being converted to a decimal for easier computation
        double subtotal = (inputPrice1 * inputQuantity1) + (inputPrice2 * inputQuantity2) + (inputPrice3 * inputQuantity3);
        double tax = subtotal * 0.055;
        double total = subtotal + tax;

        // formatted string for self-checkout, with the totals being rounded to two decimals places
        String selfCheckout = String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, tax, total);

        System.out.println(selfCheckout);
    }
}