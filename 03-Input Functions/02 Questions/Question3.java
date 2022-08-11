// Area of a Circle [Input from User] [Que3]

import java.util.*;

public class Question3 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        float Radius = scn.nextFloat();
        float Area = 3.14f * Radius * Radius;

        System.out.println(Area);

        scn.close();
    }
}