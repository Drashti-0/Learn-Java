class a{


    void add(int a, int b){
        int y=a+b;

    }

    void add(int a,int b,int c){
int z=a+b+c;
    }

}

public class couns_overloading{

    public static void main(String[] args){
        couns_overloading obj= new couns_overloading();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
    }
}