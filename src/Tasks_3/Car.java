package Tasks_3;

ublic class Car extends Vehicle {
    private String color;
    private String brand;
    private int maxSpeed;

    public Car(int numOfWheels, boolean isItManual, int currentSpeed, int maxSpeed, String color, String brand) {
        super(numOfWheels, isItManual, currentSpeed);
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.brand = brand;
    }

    private void engineSound() {
        System.out.println("Whroom-wrooom");
    }

    @Override
    public void sound() {
        super.sound();
        engineSound();
    }
    public void engineStarts(boolean engineOn) {
        if (engineOn) {
            engineSound();
        } else {
            System.out.println("There is no sound. Please, turn engine ON to hear it");
        }
    }
    public int increaseSpeedIfIsMax(int currentSpeed) {
        if (this.currentSpeed - 5 < 200) {
            this.currentSpeed += 5;
        }
        return this.currentSpeed;
    }

    public void turnLeft() {
        System.out.println("Car turned left");
    }

    public void turnRight() {
        System.out.println("Car turned right");
    }
}


