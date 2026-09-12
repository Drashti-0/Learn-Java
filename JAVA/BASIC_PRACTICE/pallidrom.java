import java.util.Scanner;

public class pallidrom{

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = obj.nextInt();

        int reminder;
        int rev = 0;

        int a=num;

        while (num > 0) {

            reminder = num % 10;
            rev = (rev * 10) + reminder;
            num = num / 10;
        }

         System.out.println("REVERSE NUMBER IS : " + rev);


        
        if(a==rev){
        System.out.println("PALLIDROME");
        }
        else{
            System.out.println("NOT PALLIDROME");
        }

       
    }
}