// Ternary Question
// Check if a student will Pass or Fail.

public class TQuestion {
    public static void main(String args[]) {
        
        int Marks = 33;

        // Using Ternary Operator
        String ReportCard = Marks >= 33 ? "PASS :)" : "FAIL :(" ;
        
        System.out.println(ReportCard);

    }
}