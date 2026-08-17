public class multiple_object {

    int s1 = 10;
    int s2 = 30;

    public static void main(String[] args) {

        multiple_object obj1 = new multiple_object();

        multiple_object obj2 = obj1;
        multiple_object obj3 = obj1;

        System.out.println(obj1.s1);
        System.out.println(obj2.s1);
        System.out.println(obj3.s1);
    }
}