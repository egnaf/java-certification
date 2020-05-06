package lesson_01_data_types;

public class WideningAndNarrowing {

    @SuppressWarnings({"unused", "UnusedAssignment"})
    public static void main(String[] args) {

        /* -------------------------------------------------------------------------------
         * - Widening is also known as Promotion, and occurs when two data types are different.
         * - Narrowing is the opposite. Note that literal values and constants (final variables) are
         * treated different to variables.
         *
         * Assigning values to smaller data types.
         * Note:
         *   - whole values without a suffix are int
         *   - decimal values without a suffix are double
         *
         * Use a suffix, such as L or F to change defaults
         */
        short shortNumber = 32767;          // short data with int value, okay as in range, no cast needed

        /* -------------------------------------------------------------------------------
         * The following causes an error because the value is an int.
         * literal (by default) and number is too great for an int.
         */
        // long longNumber = 3123456789;    // DOES NOT COMPILE
        long longNumber = 3123456789L;

        // float floatNumber1 = 3.0;        // error, because double values not compatible with float
        float floatNumber1 = 3.0f;          // explicit cast to float
        float floatNumber2 = (float) 3.0;   // explicit cast to float

        /* -------------------------------------------------------------------------------
         * Unary operators result in the same data type.
         */
        short s = 32_767;
        ++s;            // -> -32768
        getType(s);     // java.lang.Short

        /* -------------------------------------------------------------------------------
         * int and long
         */
        int x = 1;
        long y = 33;
        getType(x * y); // java.lang.Long

        /* -------------------------------------------------------------------------------
         * double and float
         */
        double doubleNumber1    = 3.14;
        float floatNumber3      = 3.14f;
        getType(doubleNumber1 * floatNumber3); // java.lang.Double

        /* -------------------------------------------------------------------------------
         * shorts
         */
        short x2 = 10;
        short y2 = 3;
        getType(x2 * y2); // java.lang.Integer, because short values promoted to int

        short result = (short) (x2 * y2); // needs cast

        /* -------------------------------------------------------------------------------
         * short, float, double
         */
        short x3  = 14;
        float y3  = 79; // does compile, because int literal promoted to float
        double z3 = 30;

        /*
         * This looks invalid at first glance, as seems that boolean being
         * assigned to long. However, it is not ==, just assignment and
         * valid
         */
        long x4 = 5;
        long y4 = x4 = 3;
        System.out.println(x4); // Outputs 3
        System.out.println(y4); // Also, outputs 3
    }

    public static void getType(Object o) {
        System.out.println(o.getClass().getTypeName());
    }
}
