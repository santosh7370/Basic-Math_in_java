/*
 Create a program to calculate the parameter,semiparater & area of triangle
 */

import java.util.Scanner;

public class Triangle 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Triangle ...........");
        Scanner scen=new Scanner(System.in);
        System.out.print("Enter the side1 of triangle in CM : = ");
        double side1=scen.nextDouble();
        System.out.print("Enter the side2 of triangle in CM : = ");
        double side2=scen.nextDouble();
        System.out.print("Enter the side3 of triangle in CM : = ");
        double side3=scen.nextDouble();
        double parameter=(side1+side2+side3);
        double s=parameter/2;
        System.out.println("\nNow calculating parameter..........");
        System.out.println("Parameter of Tringle : = "+parameter+" CM");
        System.out.println("\nNow calculating Semiparameter..........");
        System.out.println("Semiparameter of Tringle : = "+s+" CM");
        System.out.println("\nNow calculating Area..........");
        double heros=(s*(s-side1)*(s-side2)*(s-side3));
        double area=Math.sqrt(heros);
        System.out.println("Area of Tringle : = "+area+" square CM");
    }
}