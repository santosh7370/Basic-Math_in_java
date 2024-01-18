import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class ProductOfFloatingPoint 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter first floating number : = ");
        float x=scn.nextFloat();
        System.out.println("Now Please enter second floating number : = ");
        double y=scn.nextDouble();
        System.out.println("Calculation of floating number ...........");
        System.out.println("Product of floating number : = "+(double)(x*y));   
    }
}
