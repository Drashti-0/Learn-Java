class Cellphone {
    // Methods to print messages
    public void ringing() {
        System.out.println("Ringing...");
    }

    public void vibrating() {
        System.out.println("Vibrating...");
    }
}

public class basic2_oop{
    public static void main(String[] args) {
        // Creating object of Cellphone
        Cellphone myPhone = new Cellphone();

        // Calling methods
        myPhone.ringing();
        myPhone.vibrating();
    }
}