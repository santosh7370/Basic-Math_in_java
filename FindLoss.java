import java.util.Scanner;

public class FindLoss 
{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Welcome to calculation ............");
        System.out.println("Enter the Cost Price ........");
        int cp=scn.nextInt();
        System.out.println("Enter the Selling Price ........");
        int sp=scn.nextInt();
        int loss=cp-sp;
        System.out.println("Now calculting .............");
        System.out.println("your Loss Value is : = " + loss);
    }
}
