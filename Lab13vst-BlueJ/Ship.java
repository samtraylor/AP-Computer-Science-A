public abstract class Ship implements Seafaring
{
    private int xcoordinate = 0;
    private int ycoordinate = 0;
    public int zcoordinate = 0;
    private int hullStrength;
    private int timeDeployed = 0;
    private int speed;
    
    
    public void deploy(int item) {item--; System.out.println("Deployed!");}
    public void move(int x, int y)
    {
        xcoordinate += x; ycoordinate += y; timeChange(x,y);
        
        System.out.println("Pos: ( " + xcoordinate + " , " + ycoordinate + " , " + zcoordinate + " ), time since deployment: " + timeDeployed);
    }
    public Ship(int speed, int hullStrength)
    {
        this.speed = speed; this.hullStrength = hullStrength;
    }
    private void timeChange(int x, int y)
    {
        double distance = Math.sqrt((x*x) + (y*y));
        int t = (int)(distance/speed);
        timeDeployed += t;
    }
    

}
