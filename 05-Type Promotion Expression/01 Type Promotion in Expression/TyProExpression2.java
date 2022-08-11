// Type Promotion in Expression 2

public class TyProExpression2 {
    public static void main(String args[]) {
        
        short a = 6;
        byte b = 25;
        char c = 'c';
        byte bt = (byte) (a + b + c);

        System.out.println(bt);
    }
}