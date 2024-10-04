package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles you've driven: ");
        double milesDriven = input.nextDouble();
        System.out.println("now enter the gallons of gas you've used: ");
        double gallonsGas = input.nextDouble();
        input.close();

        double milesPerGallon = milesDriven/gallonsGas;
        System.out.println("Current MPG = "+ milesPerGallon);

    }
}
