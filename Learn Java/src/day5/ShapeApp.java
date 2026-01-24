package day5;

abstract class Shape {
    // Abstract method (no body)
    public abstract double area();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // Implementing and overriding the abstract method
    @Override
    public double area() {
        return side * side;
    }
}

public class ShapeApp {
    public static void main(String[] args) {
        Shape mySquare = new Square(5.0);
        System.out.println("The area of the square is: " + mySquare.area());
    }
}