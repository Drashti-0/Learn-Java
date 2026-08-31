import java.util.Scanner;

public class sumavg{
    public static void main(String[] args){

        Scanner obj =new Scanner(System.in);

        int[] arr= new int[5];

        int sum=0;

        System.out.println("Enter a five numbers:");

        for(int i=0;i<5;i++){
            arr[i]=obj.nextInt();
            sum+=arr[i];
        }


double avg =sum/5;

        System.out.println("The sum is : "+sum);
        System.out.println("the avg is : "+avg);






    }




}