import java.util.Scanner;

public class SimpleCalculation 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number : = ");
        int a=input.nextInt();
        System.out.print("Now enter the other number : = ");
        int b=input.nextInt();
        System.out.println("\nAddition of two number : = " + (a+b));
        System.out.println("\nSubtraction of two number : = " + (a-b));
        System.out.println("\nMultipliction of two number : = "+ (a*b));
        System.out.println("\nDivision of two number : = " + (a/b));
        System.out.println("\nRemainder of two number : = " + (a%b));
    }
}
