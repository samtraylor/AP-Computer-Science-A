// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape
{
   private int xPos1;
   private int yPos1;
   private int xPos2;
   private int yPos2;
   private int xPos3;
   private int yPos3;
   private int xPos4;
   private int yPos4;
   private int xPos5;
   private int yPos5;
   private int xPos6;
   private int yPos6;
   private int xPos7;
   private int yPos7;
   private int xPos8;
   private int yPos8;
   public Shape3Octagon(int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int y1, int y2, int y3, int y4, int y5, int y6, int y7, int y8, int n){
   xPos1 = x1;
   yPos1 = y1;
   xPos2 = x2;
   yPos2 = y2;
   xPos3 = x3;
   yPos3 = y3;
   xPos4 = x4;
   yPos4 = y4;
   xPos5 = x5;
   yPos5 = y5;
   xPos6 = x6;
   yPos6 = y6;
   xPos7 = x7;
   yPos7 = y7;
   xPos8 = x8;
   yPos8 = y8;
}
       public void drawShape(Graphics g)
   {
       int xpoints[] = {xPos1, xPos2, xPos3, xPos4, xPos5, xPos6, xPos7, xPos8};
       int ypoints[] = {yPos1, yPos2, yPos3, yPos4, yPos5, yPos6, yPos7, yPos8};
       int npoints = 8;
       g.fillPolygon(xpoints, ypoints, npoints);
       g.setColor(Color.black);
   }
}

