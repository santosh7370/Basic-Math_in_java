import java.util.*;
public class SumOfCubeOfNaturalNumber 
{
    public static void main(String[] args) {
        System.out.println("Welcome to Sum of cube of natural numbers calculation .............");
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter last natural number for calculation : = ");
        int number=scan.nextInt();
        long sum=number*(number+1)/2;
        double cube=Math.pow(sum,2);
        System.out.println("Now calculating .........");
        System.out.println("Sum of cube natural number : = "+cube);
    }
}