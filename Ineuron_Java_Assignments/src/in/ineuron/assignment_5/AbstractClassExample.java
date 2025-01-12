package in.ineuron.assignment_5;

public class AbstractClassExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.sleep();

        Animal cat = new Cat();
        cat.sound();
        cat.sleep();
    }
}
