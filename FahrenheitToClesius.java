/*
 * Create a program to convert fahrenheit to celsius
 * Usint formula celsius=(fahrenheit-32)*(5/9)
 */

import java.util.Scanner;

public class FahrenheitToClesius 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Converting Fahrenheit to celsius..........");
        Scanner scern=new Scanner( System.in);
        System.out.println("Please enter the fahrenheit value : = ");
        int frnht=scern.nextInt();
        double celsius=(frnht-32)*5/9;
        System.out.println("Now Calculating ..................");
        System.out.println("Celsius : = "+celsius+ " C");
    }    
}
