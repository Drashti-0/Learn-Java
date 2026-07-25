class Square {
    int side; // property

    // Method to initialize side
    public void setSide(int s) {
        side = s;
    }

    // Method to calculate area
    public int area() {
        return side * side;
    }

    // Method to calculate perimeter
    public int perimeter() {
        return 4 * side;
    }
}

public class basic3_oop {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setSide(5); // Initializing side with 5

        System.out.println("Side of Square: " + sq.side);
        System.out.println("Area of Square: " + sq.area());
        System.out.println("Perimeter of Square: " + sq.perimeter());
    }
}