import java.util.*;
public class prog1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int amt;
        System.out.println("Enter the income amount: ");
        amt=sc.nextInt();
        if(amt<=50000)
            System.out.println("NO IT_TAX\n IT TAX IS: NIL");
        else if(amt<=60000)
            System.out.println("INCOME TAX IS: "+(amt-50000)*0.1);
        else if(amt<=150000)
            System.out.println("INCOME TAX IS: "+(amt-60000)*0.2);  
        else
            System.out.println("INCOME TAX IS: "+(amt-110000)*0.3);
    }
}