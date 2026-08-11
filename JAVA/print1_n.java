import java.util.Scanner;

public class print1_n {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int a = obj.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
    }
}