import java.util.Scanner;

public class calculator_switch{

    public static void main(String[] args) {

Scanner obj=new Scanner(System.in);

int choice=obj.nextInt();
int a=obj.nextInt();
int b=obj.nextInt();

System.out.println("1.ADDITION");
System.out.println("2.SUBSTRACTION");
System.out.println("3.MULTIPLICATION");
System.out.println("4.DIVISION");
 System.out.println("5.NO Operation");

switch(choice){

case 1:
    System.out.println("Addition a+b : " + (a+b) );
    break;

case 2:

     System.out.println("SUBSTRACTION a-b : " +  (a-b) );
     break;

     case 3:

         System.out.println("MULTIPLICATION a*b : " +(a*b) );
         break;

         case 4:
             System.out.println("DIVISION a/b : " + (a/b) );
             break;

             default:

                 System.out.println("no opperation");
                 break;






}



        
    }
}