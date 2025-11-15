/* ***************************************************************************
This is a comment about the MAIN program.
*************************************************************************** */

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float MyMinFloatValue = Float.MIN_VALUE;
        float MyMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + MyMinFloatValue);
        System.out.println("Float maximum value = " + MyMaxFloatValue);

        double MyMinDoubleValue = Double.MIN_VALUE;
        double MyMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Float minimum value = " + MyMinDoubleValue);
        System.out.println("Float maximum value = " + MyMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        // float myFloatValue = (float) 5.25;
        double myDoubleValue = 5f / 3f;
        // double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue =" + myIntValue);
        System.out.println("MyFloatValue =" + myFloatValue);
        System.out.println("MyDoubleValue =" + myDoubleValue);

        double numberOfPounds = 200d;
        double numberOfKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms =" + numberOfKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
