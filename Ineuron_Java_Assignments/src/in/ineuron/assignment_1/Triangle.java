package in.ineuron.assignment_1;

//Triangle class implementing the Shape interface
class Triangle implements Shape {
 private double sideA, sideB, sideC;

 // Constructor
 public Triangle(double sideA, double sideB, double sideC) {
     this.sideA = sideA;
     this.sideB = sideB;
     this.sideC = sideC;
 }

 @Override
 public double calculateArea() {
     double s = (sideA + sideB + sideC) / 2; // Semi-perimeter
     return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
 }

 @Override
 public double calculatePerimeter() {
     return sideA + sideB + sideC;
 }
}
