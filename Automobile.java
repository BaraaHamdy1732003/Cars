public abstract class Automobile {
    protected int numWheels;
    protected int numDoors;

    public Automobile(int numWheels, int numDoors) {
        this.numWheels = numWheels;
        this.numDoors = numDoors;
    }

    public abstract void drive();

    public void lowerRoof() {
    }
}