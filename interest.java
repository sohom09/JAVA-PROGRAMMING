
/**
 * Write a description of class interest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class interest
{
  public static void main(int p, int r, int t)
  {
      double si=0, amt=0;
      si=(p*r*t)/100.0;
      amt=p+si;
      System.out.println("The Simple Interest= "+si);
      System.out.println("The Amount= "+amt);
    }
}