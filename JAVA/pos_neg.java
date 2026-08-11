
import java.util.Scanner;

public class pos_neg{

public static void main(String[] args){
   

Scanner obj = new Scanner(System.in);
System.out.println("Enter your number: ");
    int a = obj.nextInt ();

if(a>0){
    System.out.println("a is POSITIVE");

}

else if(a<0){
    System.out.println("a is NEGATIVE");
}


else{
    System.out.println("a IS ZERO");
}



}






}