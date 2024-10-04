package org.launchcode;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter height: ");
        int height = input.nextInt();
        System.out.println("please enter width: ");
        int width = input.nextInt();
        input.close();
        int areaOfRectangle = width*height;
        System.out.println("The area of your rectangle is " + areaOfRectangle);
    }
}
