
/**
 * Write a description of class Sailboat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sailboat extends Ship
{
    private int speed = 2;
    private int hullStrength = 50;
    
    
    
    Sailboat sailboat = new Sailboat(2, 50);
    public void main()
    {
        System.out.println("Sailboat: \n \n");
        for(int num = 0; num <= 6; num++)
        {
            int newX = (int)Math.random() * 21;
            int newY = (int)Math.random() * 21;
            int negX = (int)Math.random() * 2;
            int negY = (int)Math.random() * 2;
            if(negX == 1) {newX *= -1;}
            if(negY == 1) {newY *= -1;}
            sailboat.moveSail(newX, newY);
        }
    }
    private void moveSail(int x, int y)
    {
        if(x > 0){speed = 3;}
        if(x < 0){speed = 2;}
        if(x == 0){speed = 1;}
        sailboat.move(x, y);
    }
    public Sailboat(int speed, int hullStrength)
    {
        super(speed, hullStrength);
    }
}
