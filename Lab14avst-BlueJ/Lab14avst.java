// Lab14avst.java
// Lab14a
// Student starting version


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Lab14avst extends Applet
{
    
    public void paint(Graphics g)
	{
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    
    shapes.add(new Shape1Square(155, 175, 100, 100)); 
    shapes.add(new Shape2Triangle(430, 175, 480, 75, 530, 175, 3));
    shapes.add(new Shape3Octagon(160, 160, 185, 210, 235, 235, 210, 185, 425, 450, 475, 475, 450, 425, 400, 400, 8));
    shapes.add(new Shape4Circle(430, 365, 100, 100));
    drawGrid(g);
   
  
	for(Shape shape : shapes) {
        shape.drawShape(g);
    }
	}

	public void drawGrid(Graphics g)
	{
      g.drawRect(10,10,800,600);
		g.drawLine(10,300,810,300);
		g.drawLine(410,10,410,610);
	}
	
}

