
/**
 * Write a description of class AircraftCarrier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AircraftCarrier extends Ship
{
    private int speed = 4;
    private int hullStrength = 500;
    public int planes = 10;
    
    
    AircraftCarrier carrier = new AircraftCarrier(4, 500);
    public void main()
    {
        System.out.println("Aircraft Carrier: \n \n");
        for(int num = 0; num <= 3; num++)
        {
            int newX = (int)Math.random() * 21;
            int newY = (int)Math.random() * 21;
            int negX = (int)Math.random() * 2;
            int negY = (int)Math.random() * 2;
            if(negX == 1) {newX *= -1;}
            if(negY == 1) {newY *= -1;}
            carrier.move(newX, newY);
        }
        deploy(planes); planes--;
        for(int num = 0; num <= 3; num++)
        {
            int newX = (int)Math.random() * 21;
            int newY = (int)Math.random() * 21;
            int negX = (int)Math.random() * 2;
            int negY = (int)Math.random() * 2;
            if(negX == 1) {newX *= -1;}
            if(negY == 1) {newY *= -1;}
            carrier.move(newX, newY);
        }
        planeLand(2); 
    }
    public AircraftCarrier(int speed, int hullStrength)
    {
        super(speed, hullStrength);
    }
    private void planeLand(int x)
    {
        planes += x;
        System.out.println("Planes have landed! You now have " + planes + " planes!");
    }
    /*private void doStuff()
    {
        System.out.println("Aircraft Carrier: \n \n");
        for(int num = 0; num <= 3; num++)
        {
            int newX = (int)Math.random() * 21;
            int newY = (int)Math.random() * 21;
            int negX = (int)Math.random() * 2;
            int negY = (int)Math.random() * 2;
            if(negX == 1) {newX *= -1;}
            if(negY == 1) {newY *= -1;}
            carrier.move(newX, newY);
        }
        deploy(planes); planes--;
        for(int num = 0; num <= 3; num++)
        {
            int newX = (int)Math.random() * 21;
            int newY = (int)Math.random() * 21;
            int negX = (int)Math.random() * 2;
            int negY = (int)Math.random() * 2;
            if(negX == 1) {newX *= -1;}
            if(negY == 1) {newY *= -1;}
            carrier.move(newX, newY);
        }
        planeLand(2);
    } */
}
