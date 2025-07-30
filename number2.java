
/**
 * Write a description of class number2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
Class import java.util.Scanner;
public class number2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a;
        System.out.println("Enter a number: ");
        a=in.nexint();
        if(a>0&&a%2==0)
        System.out.println("The succedding numbers are: "+(a+2)+","+(a+4)+","+(a+6));
        else if(a<0&&a%2!=0)
        System.out.println("The preceeding  numbers are: "+(a+2)+","+(a-4)+","+(a-6));
        else
        System.out.println(The number is neither a positive even nor a negative odd");
    }
}

        
    