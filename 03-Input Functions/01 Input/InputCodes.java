// All Inputs in Java

import java.util.*;

public class InputCodes {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        // next
        String input = scn.next();
        System.out.println(input);

        // nextLine
        String name = scn.nextLine();
        System.out.println(name);

        // nextInt
        int a = scn.nextInt();
        System.out.println(a);

        // nextByte
        byte b = scn.nextByte();
        System.out.println(b);

        // nextFloat
        float pi = scn.nextFloat();
        System.out.println(pi);

        // nextDouble
        double value = scn.nextDouble();
        System.out.println(value);

        // nextBoolean
        boolean var = scn.nextBoolean();
        System.out.println(var);

        // nextShort
        short number = scn.nextShort();
        System.out.println(number);
        
        // nextLong
        long bigValue = scn.nextLong();
        System.out.println(bigValue);

        scn.close();

    }
}