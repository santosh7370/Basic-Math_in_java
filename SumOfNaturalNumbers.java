//Consecutive n natural numbers and sum

import java.util.Scanner;

public class SumOfNaturalNumbers 
{
    public static void main(String[] args) {
        System.out.println("Welcome to Sum of natural numbers calculation .............");
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter last natural number for calculation : = ");
        int number=scan.nextInt();
        long sum=number*(number+1)/2;
        System.out.println("Now calculating .........");
        System.out.println("Sum of natural number : = "+sum);
    }
}
