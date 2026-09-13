class Bank {

    private int balance = 5000;

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void display() {
        System.out.println("Balance = " + balance);
    }
}

public class bank {
    public static void main(String[] args) {

        Bank obj = new Bank();

        obj.display();

        obj.deposit(2000);
        obj.display();

        obj.withdraw(1000);
        obj.display();
    }
}