import java.awt.*;
import java.applet.*;
import java.util.ArrayList;
public class Train
{
    public Train(int xCoord, int yCoord) {
        ArrayList<RailCar> train = new ArrayList<RailCar>();
         train.add(new Locomotive(Color.blue,100,300));
        }
    public void addCar(String type, Color c ) {
        
    }
    public static void showCars(){
          for (RailCar trainCars: train) {
            trainCars.drawCar(g);
        }
    