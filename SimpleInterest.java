/*
 Create a program to calclulate simple interest 
 using formula simple interest(S)=(P*T*R)/100
 P=principal
 T=time
 R=rate
 */

import java.util.Scanner;

public class SimpleInterest 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Calculation or Simple interest .......");
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Amount of Principal : = ");
        int P=scn.nextInt();
        System.out.println("Now Enter Totel Time of Hold in Year : = ");
        int T=scn.nextInt();
        System.out.println("Now enter Rate for Interest : = ");
        double R=scn.nextDouble();
        double simpleInterest=(P*T*R)/100;
        System.out.println("Now Calculating ............");
        System.out.println("You Total Simple Interest is : = "+ simpleInterest+ " RS");
    }
}
