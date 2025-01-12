package in.ineuron.assignment_5;

class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle starts by pedaling.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stops with hand brakes.");
    }
}
