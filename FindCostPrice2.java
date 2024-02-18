import java.util.Scanner;

public class FindCostPrice2 
{
     public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Welcome to calculation ............");
        System.out.println("Enter the Selling Price ........");
        int sp=scn.nextInt();
        System.out.println("Enter the Loss value ........");
        int loss=scn.nextInt();
        int cp=sp+loss;
        System.out.println("Now calculting .............");
        System.out.println("your Cost Price is : = " + cp);
    }
}
