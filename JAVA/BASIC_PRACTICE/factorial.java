
import java.util.Scanner;

public class factorial{
    public static void main(String[] args){

Scanner obj=new Scanner(System.in);

int num=obj.nextInt();
int facto=1;

for(int i=1;i<num;i++){
   facto=facto*i;
}

System.out.println("FACTORIAL NUM is : " +num);


    }
}