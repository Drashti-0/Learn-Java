class type{

private int a=5;
protected int b=10;
 int c=15;

public int d=290;


void display(){

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);

}
}


public class data_type{

public static void main(String[] args) {
    
    type obj = new type();

    obj.display();

    System.out.println("*/*/**/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");

    System.out.println(obj.d);
    System.out.println(obj.c);
    System.out.println(obj.b);
   
   // System.out.println(obj.a);


  



}




}