import java.util.Scanner;

public class FindPercentageLoss 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Welcome to calculation ............");
        System.out.println("Enter the Cost Price ........");
        int cp=scn.nextInt();
        System.out.println("Enter the Loss value ........");
        int loss=scn.nextInt();
        double prcntloss=(loss*100);
        double percntloss=Math.abs(prcntloss/cp);
        System.out.println("Now calculting .............");
        System.out.println("your Loss Percentage is : = " + percntloss +" % ");
    }
}
