
/**
 * Write a description of class number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
public class number
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        int a,b,sq,cb;
        System.out.println("Enter two numbers");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        if(a!=b)
        {
            if(a<b)
            {
                sq=a*a;
                cb=b*b*b;
            }
            else
            {
                sq=b*b;
                cb=a*a*a;
            }
            System.out.println("The square of smaller number:"+sq);
            System.out.println("The cube of greater number:"+cb);
        }
        else
        System.out.println("Both the numbers are equal");
    }
}
    