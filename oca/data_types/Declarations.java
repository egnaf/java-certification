package data_types;

public class Declarations {

    @SuppressWarnings({"unused", "UnusedAssignment"})
    public static void main(String[] args) {

        int x = 1, y = 2, z = x + y;
        // int i = j = k = 9;      //is invalid
        int i, j, k;
        i = j = k = 9;
        // int x2, int y2;      // compile error, interpreted as 2 different types
        // int x3 , String s;   // compile error

        /* -------------------------------------------------------------------------------
         * The separator "_" was added in Java 7 and has the following usage rules:
         *  - cannot appear at start or end
         *  - cannot appear either side of decimal point
         */
        // double notAtStart = _1000.00;    // DOES NOT COMPILE
        // double notAtEnd = 1000.00_;      // DOES NOT COMPILE
        // double notByDecimal = 1000_.00;  // DOES NOT COMPILE
        double legal = 1_000_000.000_100;   // this one compiles
        int multiple = 1___000;             // multiple underscores are legal
    }
}
