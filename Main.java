public class Main {
    public static void main(String[] args) {
        SportsCar mySportsCar = new SportsCar();
        Cabriolet myCabriolet = new Cabriolet(true);

        mySportsCar.drive();
        myCabriolet.drive();
    }
}
