public class basic_class{
    String name ;
    int val;


    public static void main(){
        
        //class name object_name = new class_name();
        basic_class s1=new basic_class();

        s1.name ="DRASHTI";
        s1.val = 100;

        System.out.println("NAME: " + s1.name);
        System.out.println("VAL: " + s1.val);

    }
}