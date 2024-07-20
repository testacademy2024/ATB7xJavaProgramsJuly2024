package ex_Assignments;
/*
Write a program that prints numbers from 1 to 100.
However, for multiples of 3, print "Fizz" instead of the number,
and for multiples of 5, print "Buzz."
For numbers that are multiples of both 3 and 5, print "FizzBuzz."
*/

public class FizzBuzzTests {
    public static void main(String[] args) {
        for(int k=1; k <=100;k++)
        {
            if(k%3==0&&k%5==0)
            {
                System.out.println("Fizzbuzz");
            } else if (k%3==0) {
                System.out.println("Fizz");

            } else if (k%5==0) {
                System.out.println("Buzz");

            }
            else {
                System.out.println(k);
            }
    }

    }
}
