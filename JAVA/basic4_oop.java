class Rectangle {
    int length;
    int breadth;

    // Method to initialize length and breadth
    public void setDimensions(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    public int area() {
        return length * breadth;
    }

    // Method to calculate perimeter
    public int perimeter() {
        return 2 * (length + breadth);
    }
}

public class basic4_oop
{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setDimensions(10, 5); // Initializing length=10, breadth=5

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Perimeter of Rectangle: " + rect.perimeter());
    }
}