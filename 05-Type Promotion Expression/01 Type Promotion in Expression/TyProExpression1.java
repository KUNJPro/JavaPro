// Type Promotion in Expression 1

public class TyProExpression1 {
    public static  void main(String args[]) {

        char a = 'a';
        char b = 'b';

        System.out.println((int)(a));
        System.out.println((int)(b));

        System.out.println(a);      // Type Promotion is only for Convertion 
        System.out.println(b - a);
    }     
}