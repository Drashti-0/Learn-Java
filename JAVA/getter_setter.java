class type{
    private int a;

    void setter(int a){
        this.a=a;
    }


    void getter(){
        System.out.println(a);
    }

}

public class getter_setter{
    public static void main(String[] args) {
        
        type obj = new type();

        obj.setter(5);
        obj.getter();
    }
}