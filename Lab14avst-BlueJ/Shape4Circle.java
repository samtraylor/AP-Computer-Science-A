// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape
{
   private int xPos;
   private int yPos;
   private int width;
   private int height;
   public Shape4Circle(int x, int y, int w, int h) {
       xPos = x;
       yPos = y;
       width = w;
       height = h;
    }
    public void drawShape(Graphics g)
   {
      g.fillOval(xPos,yPos,width,height);
      g.setColor(Color.black);
   }   
}
