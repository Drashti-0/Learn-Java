/* A final variable is a constant whose value cannot be changed after initialization.

final variable → Cannot CHANGE
final method   → Cannot OVERRIDE
final class    → Cannot INHERIT


*/

public class Final_variable{

    public static void main(String[] s){

        final double PI = 3.14159;

       /*  PI = 2000; */ /* give error */

    }
}