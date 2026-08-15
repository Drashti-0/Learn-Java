class MyThr extends Thread {

    MyThr(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Hello " + getName());
    }
}

public class constructore {
    public static void main(String[] args) {

        MyThr t1 = new MyThr("Harry");
        MyThr t2 = new MyThr("Ram");

        t1.start();
        t2.start();
    }
}