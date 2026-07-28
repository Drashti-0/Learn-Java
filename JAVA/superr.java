



class superr {
    String color = "White";
}

class Dog extends superr {

    String color = "Black";

    void printColor() {

        System.out.println(color);

        System.out.println(super.color);

    }

    public static void main(String args[]) {

        Dog d = new Dog();

        d.printColor();

    }
}