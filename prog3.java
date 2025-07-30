import java.util.*;
public class prog3
{
    public static void main(String args[])
    {
        int n,a=0,b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term: ");
        n=sc.nextInt();
        System.out.println("Fibonacci series: ");
	for(int i=0;i<=n;i++)
	{
		int c=a+b;
		System.out.print(c+"\t");
		a=b;
		b=c;
	}
    }
}