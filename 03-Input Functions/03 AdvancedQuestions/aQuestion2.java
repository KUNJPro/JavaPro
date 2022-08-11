// [aQue2]
// In a program, input the side of square. You have to output the area of the square.
// Hint : Area of a square is (Side * Side)

import java.util.*;

public class aQuestion2 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int side = scn.nextInt();
        int area = side * side;

        System.out.println("Area of Square : " + area);

        scn.close();
    }
}