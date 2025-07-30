import java.util.Scanner;
public class prog7
{
    static double netSalary(double sal,double tax)
    {
        return sal-(sal*tax/100);
    }
    static String grade()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the grade: ");
        String grade=sc.nextLine();
        return grade;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the salary of the employee: ");
        double sal1=sc.nextDouble();
        System.out.print("Enter the tax percentage: ");
        double tax1=sc.nextDouble();
        double sal=netSalary(sal1,tax1);
        String grade1=grade();
        System.out.println("The net salary of the employee is: Rs. "+sal);
        System.out.println("The grade of the employee is: "+grade1);
    }
}