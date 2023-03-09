import java.util.Scanner;

class Factorial
{
    public static void main(String[] args)
    {
        double fact=1,n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}