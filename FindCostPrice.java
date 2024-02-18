import java.util.Scanner;

public class FindCostPrice 
{
     public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Welcome to calculation ............");
        System.out.println("Enter the Selling Price ........");
        int sp=scn.nextInt();
        System.out.println("Enter the Profit value ........");
        int profit=scn.nextInt();
        int cp=sp-profit;
        System.out.println("Now calculting .............");
        System.out.println("your Cost Price is : = " + cp);
    }
}