class Circle {
    double radius;

    // Method to initialize radius
    public void setRadius(double r) {
        radius = r;
    }

    // Method to calculate area (π * r * r)
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter / circumference (2 * π * r)
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class basic6_oop {
    public static void main(String[] args) {
        Circle circ = new Circle();
        circ.setRadius(7.0); // Initializing radius with 7.0

        System.out.println("Radius of Circle: " + circ.radius);
        System.out.println("Area of Circle: " + circ.area());
        System.out.println("Perimeter of Circle: " + circ.perimeter());
    }
}