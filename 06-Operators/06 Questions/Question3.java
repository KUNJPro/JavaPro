// [Que3]
// What will be the output of the following program...
// Ans 3 : Output : 4, 0, 0

public class Question3 {
    public static void main(String[] args) {
        
        int A, B, C;
        A = B = C = 2;

        A += B;
        B -= C;
        C /= (A + B);

        System.out.println(A + " " + B + " " + C);

    }
}