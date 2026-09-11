import java.util.Scanner;

public class coutdigit{

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = obj.nextInt();

        int reminder,rev=0;
        int count=0;


        int a=num;

        while (num > 0) {

            reminder = num % 10;
            rev = (rev * 10) + reminder;
            num = num / 10;

            count++;
        }

System.out.println("COUNt DIGIT: "+count);
         


        
       
       
    }
}