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
        double point1X = 5;
        double point1Y = 10;
        double point2X = 85;
        double point2Y = 50;
        double distance;

        distance = (point2X - point1X) + (point2Y - point1Y);
        System.out.println("The total distance between the two points is " + distance + '.');

        // Question 6:
        double variableValue = -3.8;
        double absoluteValue;

        absoluteValue = Math.abs(variableValue);
        System.out.println("The absolute value of " + variableValue + " is " + absoluteValue + '.');

        // Question 7:


    }
}
