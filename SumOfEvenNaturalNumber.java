import java.util.Scanner;

public class SumOfEvenNaturalNumber 
{
    public static void main(String[] args) {
        System.out.println("Welcome to calculation sum of even natural number ..........");
        Scanner scen=new Scanner(System.in);
        System.out.println("Enter the last number for calculation  : = ");
        int n=scen.nextInt();
        int sum=n*(n+2);
        System.out.println("Now Calculating ..........");
        System.out.println("Sum of Even Natural number : = "+sum);
    }   
}
