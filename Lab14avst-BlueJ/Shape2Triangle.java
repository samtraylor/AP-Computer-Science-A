// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape
{
   private int xPos1;
   private int yPos1;
   private int xPos2;
   private int yPos2;
   private int xPos3;
   private int yPos3;
   public Shape2Triangle(int x1, int y1, int x2, int y2, int x3, int y3, int n) {
   xPos1 = x1;
   yPos1 = y1;
   xPos2 = x2;
   yPos2 = y2;
   xPos3 = x3;
   yPos3 = y3;
   }
   
   public void drawShape(Graphics g)
   {
       int xpoints[] = {xPos1, xPos2, xPos3};
       int ypoints[] = {yPos1, yPos2, yPos3};
       int npoints = 3;
       g.fillPolygon(xpoints, ypoints, npoints);
       g.setColor(Color.black);
   }
}

