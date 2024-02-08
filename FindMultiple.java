import java.util.Scanner;

public class FindMultiple 
{
     public static void main(String[] args) 
{
    Scanner scrn=new Scanner(System.in);
    System.out.println("Enter the Multiplicand value ...........");
    int mlpd=scrn.nextInt();
    System.out.println("Enter the Multiplier value ...........");
    int mlpr=scrn.nextInt();
    double mlp=mlpd*mlpr;
    System.out.println("Now calculating ................");
    System.out.print("your Multiple value is = " +mlp);
}
}
