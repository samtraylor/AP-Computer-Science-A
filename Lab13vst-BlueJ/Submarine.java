public class Submarine extends Ship
{
    private int speed = 5;
    private int hullStrength = 100;
    public int torpedos = 10;
    
    
    Submarine submarine = new Submarine(5, 100);
    public void main()
    {
        System.out.println("Submarine: \n \n");
        for(int num = 0; num <= 3; num++)
        {
            int newX = (int)Math.random() * 21;
            int newY = (int)Math.random() * 21;
            int negX = (int)Math.random() * 2;
            int negY = (int)Math.random() * 2;
            if(negX == 1) {newX *= -1;}
            if(negY == 1) {newY *= -1;}
            submarine.move(newX, newY);
        }
        dive((int) Math.random() * 51);
        submarine.deploy(torpedos);
        for(int num = 0; num <= 3; num++)
        {
            int newX = (int)Math.random() * 21;
            int newY = (int)Math.random() * 21;
            int negX = (int)Math.random() * 2;
            int negY = (int)Math.random() * 2;
            if(negX == 1) {newX *= -1;}
            if(negY == 1) {newY *= -1;}
            submarine.move(newX, newY);
        }
        dive((int) Math.random() * 51);
    }
    public Submarine(int speed, int hullStrength)
    {
        super(speed, hullStrength);
    }
    public void dive(int z)
    {
        submarine.zcoordinate -= z;
    }
}
