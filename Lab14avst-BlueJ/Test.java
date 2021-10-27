
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.util.ArrayList;


public class Test extends Applet {
 public void paint(Graphics g)
    {
        drawGrid(g);
    }
       public void drawGrid(Graphics g)
 {
      g.drawRect(10,10,800,600);
        g.drawLine(10,300,810,300);
        g.drawLine(410,10,410,610);
 }
 
}