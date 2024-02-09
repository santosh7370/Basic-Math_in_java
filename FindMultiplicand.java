import java.util.Scanner;

public class FindMultiplicand 
{
    public static void main(String[] args) 
{
    Scanner scrn=new Scanner(System.in);
    System.out.println("Enter the Multiple value ...........");
    int mlp=scrn.nextInt();
    System.out.println("Enter the Multiplier value ...........");
    int mlpr=scrn.nextInt();
    double mlpd=mlp/mlpr;
    System.out.println("Now calculating ................");
    System.out.print("your Multiplicand value is = " +mlpd);
}
}
