
public class bankaccount{
int bal= 500000;;
void display(){
double accno = 123456;
String name ="DRASHTI";
double bal=500000;

System.out.println("ACCOUNT NO:  "+accno);
System.out.println("NAME :" + name);
System.out.println("BALANCE: "+ bal);
}

void deposite(int dmoney){
    bal=bal+dmoney;

    System.out.println("After deposite money balance: "+bal);

}

void withdraw(int wmoney){
    bal =bal-wmoney;

    System.out.println("After withdraw money balance: "+bal);
}

public static void main(String[] args){

    bankaccount obj=new bankaccount();
obj.display();

obj.deposite(50000);
obj.withdraw(1000);







}





}