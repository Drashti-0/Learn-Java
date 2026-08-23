public class para {

void pls(int a,int b){
    System.out.println(a);
    System.out.println(b);  

    int c = a + b;
    System.out.println(c);
}



}

public class para_counstructor {
    public static void main(String[] args) {
        para obj = new para();
        obj.pls(10, 20);
    }
}