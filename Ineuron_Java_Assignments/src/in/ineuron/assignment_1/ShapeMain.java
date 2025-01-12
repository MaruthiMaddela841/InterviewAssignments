package in.ineuron.assignment_1;

public class ShapeMain {
    public static void main(String[] args) {
        // Create a Circle object
        Shape circle = new Circle(5.0); // radius = 5.0
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // Create a Triangle object
        Shape triangle = new Triangle(3.0, 4.0, 5.0); // sides = 3.0, 4.0, 5.0
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
