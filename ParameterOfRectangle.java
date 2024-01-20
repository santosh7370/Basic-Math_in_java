/* Create program to calculate parameter of rectangle.
Using parameter of rectangle = (length+width)/2
 */
import java.util.Scanner;

public class ParameterOfRectangle 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Rectangle ...........");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter length of rectangle : = ");
        double L=input.nextDouble();
        System.out.print("Enter width of rectangle : = ");
        double B=input.nextDouble();
        double parameter=(L+B)/2;
        double area=L*B;
        System.out.println("Now Calculating ............");
        System.out.println("Parameter or Rectangle : = "+parameter +" cm");
        System.out.println("Now calculating .............");
        System.out.println("Area of Rectangle : = "+area +" square CM");
    }
}
