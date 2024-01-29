import java.util.Scanner;

public class SumOfSquareNatualNumber 
{
     public static void main(String[] args) {
        System.out.println("Welcome to Sum of Square natural numbers calculation .............");
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter  natural number for calculation : = ");
        int number=scan.nextInt();
        long sumofSquare=number*(number+1)*(2*number+1)/6;
        System.out.println("Now calculating .........");
        System.out.println("Sum of Square of natural number : = "+sumofSquare);
    }
}
