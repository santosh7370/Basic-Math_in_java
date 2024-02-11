import java.util.Scanner;

public class FindDivisor 
{
    public static void main(String[] args) 
    {
        Scanner scrn=new Scanner(System.in);
    System.out.println("Enter the Dividend value ...........");
    int a=scrn.nextInt();
    System.out.println("Enter the Qunotient value ...........");
    int b=scrn.nextInt();
    System.out.println("Enter the Remainder value ..........");
    int r=scrn.nextInt();
    long dvsr=(a-r)/b;
    System.out.println("Now calculating ................");
    System.out.print("your Divisor value is = " + dvsr);
    }
}
