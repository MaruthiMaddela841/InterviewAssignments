package in.ineuron.assignment_5;

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle bicycle = new Bicycle();
        bicycle.start();
        bicycle.stop();
    }
}
