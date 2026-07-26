class  employe{
    int id;
    String name;

    public void printdetails(){
        System.out.println("my id is "+ id);
         System.out.println("my name is "+ name);

    }
}

public class customclass{
    public static void main(String[] args){
        System.out.println("this is our custom class");
        employe harry= new employe();
        employe jhon = new employe();

        harry.id=12;
        harry.name="drashti";
        jhon.id=17;
        jhon.name="jhons";

        harry.printdetails();
        jhon.printdetails();

    }
}