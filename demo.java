import java.awt.Graphics;
import java.applet.Applet;
class demo extends applet
{
    public void paint(Graphics g)
    {
        g.drawLine(12,34,150,130);
        g.drawLine(150,130,200,50);
        g.drawLine(200,50,12,34);
        g.drawLine(12,34,200,50);
    }
    public static void main(String[] args) {
        demo d = new demo();
        d.init();
        d.start();
        d.stop();
        d.destroy();
        System.out.println("Applet executed successfully.");
    }
}