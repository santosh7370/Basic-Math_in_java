import java.util.Scanner;

public class FindMultiplier 
{
public static void main(String[] args) 
{
    Scanner scrn=new Scanner(System.in);
    System.out.println("Enter the Multiple value ...........");
    int mlp=scrn.nextInt();
    System.out.println("Enter the Multiplicand value ...........");
    int mlpd=scrn.nextInt();
    double mlpr=mlp/mlpd;
    System.out.println("Now calculating ................");
    System.out.print("your Multiplier value is = " +mlpr);
}
}