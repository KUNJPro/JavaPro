// [aQue1]
// In a program, input 3 numbers: A, B & C. You have to output the average of these 3 numbers.
// Hint : Average of N numbers is sum of those numbers divided ny N.

import java.util.*;

public class aQuestion1 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        float A = scn.nextFloat();
        float B = scn.nextFloat();
        float C = scn.nextFloat();

        float avg = (A + B + C) / 3;

        System.out.println("Average : " + avg);

        scn.close();
    }
}