import java.util.Scanner;

public class FindNumberOfCube 
{
     public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to Find Cube of any positive number........");
        System.out.print("Please enter the any positive number for finding Cube value : = ");
        int num=scan.nextInt();
        System.out.println("Now calculating ..........");
        double cube=Math.pow(num, 3);
        System.out.println("Your Cube value is = " +cube);
    }
}
