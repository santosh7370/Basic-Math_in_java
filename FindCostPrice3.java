// Find Cost price if given Selling price and Profit percentage ..

import java.util.Scanner;

public class FindCostPrice3 
{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Welcom to Calculation Cost price if given Selling Price and Profit Percentage ........");
        System.out.println("Enter the Selling Price : = ");
        int sp=scn.nextInt();
        System.out.println("Now enter the Profit percentage : = ");
        int pp=scn.nextInt();
        int sum=100+pp;
        double cun=Math.abs(100/sum);
        double cp=(sp*cun);
        System.out.println("Now calculating ..........");
        System.out.println("Your Cost Price : = " + cp);
    }
}
