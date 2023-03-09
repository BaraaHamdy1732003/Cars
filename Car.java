
public abstract class Car extends Automobile {
    protected int numSeats;

    public Car(int numWheels, int numDoors, int numSeats) {
        super(numWheels, numDoors);
        this.numSeats = numSeats;
    }

    public void stop() {
    }
}