// [Que1]
// What will be the output of the following program...
// Ans 1 : Output : 5, 4

public class Question1 {
    public static void main(String[] args) {

        int X = 2;
        int Y = 5;

        int Exp1 = ( X * Y / X );
        int Exp2 = ( X * ( Y / X ));

        System.out.println(Exp1 + " , ");
        System.out.println(Exp2);
        
    }
}