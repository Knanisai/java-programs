import java.io.*;
import java.util.Scanner;
class Modulus
{
    public static void main(String[] args)
    {
        int num1, num2, rem=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1=sc.nextInt();
        System.out.println("Enter second number: ");
        num2=sc.nextInt();
        rem = num1 % num2;
        System.out.println("The remainder = "+rem);
    }
}