import java.util.Scanner;

public class FindPercentageProfit 
{
     public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Welcome to calculation ............");
        System.out.println("Enter the Cost Price ........");
        int cp=scn.nextInt();
        System.out.println("Enter the Profit value ........");
        int profit=scn.nextInt();
        double prcntprofit=(profit*100);
        double percntprofit=Math.abs(prcntprofit/cp);
        System.out.println("Now calculting .............");
        System.out.println("your Profit Percentage is : = " + percntprofit +" % ");
    }
}
