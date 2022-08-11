// Sum of a & b [Input from User] [Que1]

import java.util.*;

public class Question1 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        
        int sum = a + b;

        System.out.println(sum);

        scn.close();
        
    }
}