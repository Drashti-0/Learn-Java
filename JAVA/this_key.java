class Student {

    String name;          

        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

public class this_key {
    public static void main(String[] args) {

        Student s = new Student("Drashti");

        s.display();
    }
}