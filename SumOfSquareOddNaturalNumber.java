import java.util.Scanner;

public class SumOfSquareOddNaturalNumber 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to calculation Square of Odd natural number .........\n");
        Scanner scn=new Scanner(System.in);
        System.out.print("Please enter consective number of  Odd natural number ......\n");
        int num=scn.nextInt();
        double sum=Math.pow(num, 2);  
        System.out.println("Now calculating............\n");
        System.out.println("Sum of Square Natural Odd number : = "+sum);
    }
}
