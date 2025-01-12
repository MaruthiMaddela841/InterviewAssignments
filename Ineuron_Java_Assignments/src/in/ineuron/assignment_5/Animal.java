package in.ineuron.assignment_5;

abstract class Animal {
    // Abstract method
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("This animal sleeps.");
    }
}
