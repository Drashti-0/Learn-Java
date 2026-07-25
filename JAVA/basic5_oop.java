class TommyVecetti {
    // Method for hitting
    public void hitting() {
        System.out.println("Hitting...");
    }

    // Method for running
    public void running() {
        System.out.println("Running...");
    }

    // Method for firing
    public void firing() {
        System.out.println("Firing...");
    }
}

public class basic5_oop{
    public static void main(String[] args) {
        // Creating object of TommyVecetti
        TommyVecetti player = new TommyVecetti();

        // Calling methods
        player.hitting();
        player.running();
        player.firing();
    }
}