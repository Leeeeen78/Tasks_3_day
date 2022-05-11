package Tasks_3;
public class Vehicle {
    private int numOfWheels;
    private boolean isItManual;
    int currentSpeed;

    public Vehicle(int ofWheels, boolean isItManual, int numOfWheels) {
        this.numOfWheels = numOfWheels;
        this.isItManual = this.isItManual;
        this.currentSpeed = this.currentSpeed;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public boolean isItManual() {
        return isItManual;
    }

    public void setItManual(boolean itManual) {
        isItManual = itManual;
    }

    public void sound() {
        System.out.println("no sound");
    }

    public void printCurrentSpeed() {
        System.out.println("Current speed is: " + this.currentSpeed);
    }

    public int increaseSpeed(int currentSpeed) {
        this.currentSpeed += 5;
        return this.currentSpeed;
    }

    public int decreaseSpeed(int currentSpeed) {
        if (this.currentSpeed >= 5) {
            this.currentSpeed -= 5;
        }
        return this.currentSpeed;
    }
}
