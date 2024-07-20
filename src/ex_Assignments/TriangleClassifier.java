package ex_Assignments;

import java.util.Scanner;

/*
Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides,
determine if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or
scalene (no sides are equal).
Use an if-else statement to classify the triangle.

 */
public class TriangleClassifier {
    public static void main(String[] args) {
Scanner sc1=new Scanner(System.in);
        System.out.println("Please enter the length for  side 1");
double d1=sc1.nextDouble();

        Scanner sc2=new Scanner(System.in);
        System.out.println("please enter the length for side 2");
        double d2=sc2.nextDouble();

        Scanner sc3=new Scanner(System.in);
        System.out.println("please enter the length for side 2");
        double d3=sc3.nextDouble();

        if(d1==d2&&d2==d3)
        {
            System.out.println("it is a equilateral triangle");
        } else if (d1==d2||d2==d3||d1==d3) {
            System.out.println("it is a isosceles triangle");

        }
        else {
            System.out.println("it is a scalene triangle");
        }
    }


}
