/*
 * Create a program to calculate compound Interest 
 * using formula compoundInterest=P(1+R/100)^T
 * P=principal
 * R=rate
 * T=Time
 */

import java.util.Scanner;

public class CompoundInterest 
{
    public static void main(String[] args) {
        System.out.println("Welcome to Calculation of compournd Interest .....");
        Scanner scer=new Scanner(System.in);
        System.out.println("Please enter the Amount of Principal : =");
        int P=scer.nextInt();
        System.out.println("Now enter totel time of hold in years : = ");
        double T=scer.nextDouble();
        System.out.println("Now enter Rate for compound Interest : = ");
        double R=scer.nextDouble();
        double S=(1+R/100);
        double compoundInterest=P*Math.pow(S, T);
        System.out.println("Now Calculating ...........");
        System.out.println("Your total compound Interest : = "+compoundInterest+" RS");
    }
}
