package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height of rectangle: ");
        double height = scanner.nextDouble();
        System.out.println("area of rectangle: " + area(width, height));
        System.out.println();

        System.out.println("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        System.out.println("area of circle: " + area(radius));

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(clock < 0 || clock > 23 || !isBarking) {
            return false;
        }
        return clock < 8 || clock >=20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       return (firstAge > 13 && firstAge <= 19) ||
               (secondAge > 13 && secondAge <= 19) ||
               (thirdAge > 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int ustLimit = isSummer ? 45: 35;
        int altLimit = 25;
        return temp > altLimit && temp <= ustLimit;
    }

    public static double area(double width, double height) {
       if(width < 0 || height < 0)
           return -1;

       return width * height;
    }

    public static double area(double radius) {
       if(radius < 0)
           return -1;
       return Math.PI * Math.pow(radius, 2);
    }
}
