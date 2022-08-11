// [Que1]
// Type Promotion in Expression 1
// Char to Int [Expression : A * B]

public class Question1 {
    public static  void main(String args[]) {

        char A = 'A';
        char B = 'X';

        System.out.println((int)(A));
        System.out.println((int)(B));

        System.out.println(A);      // Type Promotion is only for Convertion 
        System.out.println(A * B);
    }     
}