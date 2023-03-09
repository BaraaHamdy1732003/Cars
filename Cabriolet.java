public class Cabriolet extends Car {
    private boolean isConvertible;

    public Cabriolet(boolean isConvertible) {
        super(4, 2, 4);
        this.isConvertible = isConvertible;
    }

    public void drive() {
        System.out.println("Driving cabriolet...");
    }
}