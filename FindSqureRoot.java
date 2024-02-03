import java.util.Scanner;

public class FindSqureRoot 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Welcome to calculation of Square root ...........");
        System.out.print("Please enter the any number for finding Squareroot value : = ");
        int num=scn.nextInt();
        double sqret=Math.sqrt(num);
        System.out.println("Now calculating ...........");
        System.out.println("Your Square root value : = "+sqret);
    }    
}
