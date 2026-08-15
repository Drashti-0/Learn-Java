class MyThr1 extends Thread {

    MyThr1(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName());
        }
    }
}

public class priority {
    public static void main(String[] args) {

        MyThr1 t1 = new MyThr1("Harry1");
        MyThr1 t2 = new MyThr1("Harry2");
        MyThr1 t3 = new MyThr1("Harry3");
        MyThr1 t4 = new MyThr1("Harry4");
        MyThr1 t5 = new MyThr1("Harry5");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}