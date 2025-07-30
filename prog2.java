import java.util.*;
public class prog2
{
    public static int factorial(int n)
    {
        int f=1;
        if(n>0)
        	return n*factorial(n-1);
	else
		return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to calculate the factorial: ");
        int n1=sc.nextInt();
        System.out.println("Factorial of "+n1+" is: "+factorial(n1));
        
    }
}