
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle
{
   public static void main(int p,int b)
   {
       double d,ar=0,peri=0;
       d=Math.sqrt(p*p+b*b);
       ar=1.0/2.0*p*b;
       peri=(p+b+d);
       System.out.println("The Area="+ar);
       System.out.println("The Perimeter="+peri);
    }
}