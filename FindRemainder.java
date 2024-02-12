import java.util.Scanner;

public class FindRemainder 
{
    public static void main(String[] args) 
    {
        Scanner scrn=new Scanner(System.in);
    System.out.println("Enter the Dividend value ...........");
    int a=scrn.nextInt();
    System.out.println("Enter the Divisor value ...........");
    int b=scrn.nextInt();
    System.out.println("Enter the Quotient value ..........");
    int q=scrn.nextInt();
    long rmndr=a-(b*q);
    System.out.println("Now calculating ................");
    System.out.print("your Remainder value is = " + rmndr);
    }
}
