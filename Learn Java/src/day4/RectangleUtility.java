package day4;

class AreaCalculator {
    public double calculateArea(double length, double width) {
        return length * width;
    }
}

public class RectangleUtility {
    public static void main(String[] args) {
        // Instantiate the utility class to use the non-static method
        AreaCalculator calc = new AreaCalculator();

        double l = 10.5;
        double w = 5.0;
        double area = calc.calculateArea(l, w);

        System.out.println("Rectangle Dimensions: " + l + " x " + w);
        System.out.println("Calculated Area: " + area);
    }
}