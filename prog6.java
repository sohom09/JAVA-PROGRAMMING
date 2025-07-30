import java.util.Scanner;
public class prog6
{
    private static double bl=0;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n0. Exit");
        while(true)
        {
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter the amount to deposit: Rs. ");
                    double dep=sc.nextDouble();
                    if(dep<0)
                    {
                        System.out.println("Deposit amount cannot be negative not allowed its always must be positive");
                        continue;
                    }
                    else
                    {
                        System.out.println("Amount deposited successfully");
                        System.out.println("Rs. "+ dep+" is credited to your account");
                        bl+=dep;
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double wit=sc.nextDouble();
                    if(wit<0)
                    {
                        System.out.println("Withdrawl amount cannot be negative not allowed its always must be positive");
                        continue;
                    }
                    else if(bl<wit)
                    {
                        System.out.println("Insufficient balance");
                        continue;
                    }
                    else
                    {
                        System.out.println("Amount withdrawn successfully");
                        System.out.println("Rs. "+ wit+" is debited from your account");
                        bl-=wit;
                    }
                    break;
                case 3:
                    System.out.println("Your account balance is Rs. "+bl);
                    break;
                case 0:
                    System.out.println("Thank you for using our services");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}