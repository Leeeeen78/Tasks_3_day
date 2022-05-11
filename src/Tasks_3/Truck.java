package Tasks_3;
import java.util.Date;

public class Truck extends Car {

    Date dateProduced;

    public Truck(int numOfWheels, boolean isItManual, int maxSpeed, int currentSpeed, String color, String brand, Date dateProduced) {
        super(numOfWheels, isItManual);

    }
}

