// [Que5]
// What will be the output of the following program...
// Ans 5 : Output : 20, 20

public class Question5 {
    public static void main(String[] args) {
        
        int X = 10, Y = 5;

        int Exp1 = (Y * (X / Y + X / Y));
        int Exp2 = (Y * X / Y + Y * X / Y);

        System.out.println(Exp1);
        System.out.println(Exp2);

    }
}