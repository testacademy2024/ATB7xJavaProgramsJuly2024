package ex_Assignments;

import java.util.Scanner;

/*
Create a program that determines whether a given year is a leap year.
 A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
 Use an if-else statement to make this determination.

 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        short year=sc.nextShort();

boolean isLeapYear=false;
if((year%4==0&&year%100!=0)||(year%400==0))
        {
            isLeapYear=true;
        }
if(isLeapYear)
{
    System.out.println("it is a leap year");
}
else {
    System.out.println("it is not a leap year");
}
    }
}
