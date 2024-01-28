import java.util.Scanner;

public class SumOfOddNaturalNumber 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to calculation of Odd natural number .........");
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter last Odd natural number ......");
        int odd=scn.nextInt();
        int clct=(odd+1)/2;
        double sum=Math.pow(clct, 2);  
        System.out.println("Now calculating............");
        System.out.println("Sum of Natural Odd number : = "+sum);
    }
}