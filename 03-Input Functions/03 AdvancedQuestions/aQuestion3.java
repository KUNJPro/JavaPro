// [aQue3]
// Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of item back to user as their bill.
// Add on: You can also try adding 18% GST TAX to the item is the bill as an advanced problem.

import java.util.*;

public class aQuestion3 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        float Pencil = scn.nextFloat();
        float Pen = scn.nextFloat();
        float Eraser =  scn.nextFloat();

        float Total = (Pencil + Pen + Eraser);
        System.out.println("Total Cost : " + Total);

        // Add on with 18% GST

        float TaxTotal = Total + (0.18f * Total);
        System.out.println("Include GST : " + TaxTotal);

        scn.close();
    }
}