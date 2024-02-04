import java.util.Scanner;

public class FindCubeRoot 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Welcome to calculation of Cube root ...........");
        System.out.print("Please enter the any number for finding Cuberoot value : = ");
        int num=scn.nextInt();
        double cuberoot=Math.cbrt(num);
        System.out.println("Now calculating ...........");
        System.out.println("Your Cube root value : = "+cuberoot);
    }    
}
