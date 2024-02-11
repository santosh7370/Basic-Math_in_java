import java.util.Scanner;

public class FindDividend 
{
    public static void main(String[] args) 
    {
        Scanner scrn=new Scanner(System.in);
    System.out.println("Enter the Divisor value ...........");
    int dvsr=scrn.nextInt();
    System.out.println("Enter the Qunotient value ...........");
    int qntt=scrn.nextInt();
    System.out.println("Enter the Remainder value ..........");
    int rmndr=scrn.nextInt();
    long dvnd=(dvsr*qntt)+rmndr;
    System.out.println("Now calculating ................");
    System.out.print("your Divident value is = " + dvnd);
    }
}
