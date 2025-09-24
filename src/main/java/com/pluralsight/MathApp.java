package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Step 1:
        // Question 1:
        double bobSalary =  25_000;
        double garySalary = 36_000;
        double highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is $" + highestSalary + '.');

        // Question 2:
        double carPrice = 9_999;
        double truckPrice = 10_999;
        double cheapestPrice;

        cheapestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The cheapest price is $" + cheapestPrice + '.');

        // Question 3:
        double pi = 3.14;
        double radius = 7.25;
        double area;

        area = Math.PI * (radius * radius);
        System.out.println("The area of the circle is " + area + '.');

        //Question 4:
        double variable = 5.0;
        double squareRoot;

        squareRoot = Math.sqrt(variable);
        System.out.println("The square root of " + variable + " is " + squareRoot + '.');

        // Question 5:
        String pointA = "(5, 10)";
        String pointB = "(85, 50)";
        String distance;

        distance = Math.

    }
}
