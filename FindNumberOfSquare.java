import java.util.Scanner;
public class FindNumberOfSquare
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to Find Square of any positive number........");
        System.out.print("Please enter the any positive number for finding Square value : = ");
        int sqr=scan.nextInt();
        System.out.println("Now calculating ..........");
        double sqre=Math.pow(sqr, 2);
        System.out.println("Your Square value is = " +sqre);
    }
}
