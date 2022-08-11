// Product of a & b [Input from User] [Que2]

import java.util.*;

public class Question2 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        float a = scn.nextFloat();
        float b = scn.nextFloat();

        float Product = a * b;

        System.out.println(Product);

        scn.close();
    }
}