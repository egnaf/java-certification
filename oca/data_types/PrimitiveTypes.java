package data_types;

public class PrimitiveTypes {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        /*
         * -------------------------------------------------------------------------------
         * The boolean type has only 2 values. Cannot use 0 or 1 like in other languages.
         * The size of a boolean variable dependent on the virtual machine.
         */
        boolean truth = true;
        boolean lie   = false;

        /* -------------------------------------------------------------------------------
         * 8 bits
         * [-128, 127]
         *
         * 2^8 = 256
         */
        byte byteNumber = 0;

        /* -------------------------------------------------------------------------------
         * 16 bits
         * [0, 65 535] (only positive numbers)
         *
         * 2^16 = 65 535
         */
        char unicode    = '\u0000';
        char character  = 's';
        char symbol     = '$';
        char newLine    = '\n';

        /*
            Other system characters:
            \b backspace
            \t tab
            \n linefeed
            \f form feed (page break)
            \r carriage return
            \" double quote
            \' single quote
            \\ backslash
        */

        /* -------------------------------------------------------------------------------
         * 16 bits
         * [-32 768, 32 767]
         *
         * 2^16 = 65 535
         */
        short shortNumber = 0;

        /* -------------------------------------------------------------------------------
         * 32 bits
         * [-2 147 483_648, 2 147 483 647]
         *
         * 2^32 = 4 294 967 296
         */
        int integerNumber = -2_147_483_648;

        /* -------------------------------------------------------------------------------
         * 64 bits
         * The long type is required by l or L, as int is default for decimals.
         * [-9 223 372 036 854 775 808, 9 223 372 036 854 775 807]
         *
         * 2^64 = 18 446 744 073 709 552 000
         */
        long longNumber = -9_223_372_036_854_775_808L;

        /* -------------------------------------------------------------------------------
         * 32 bits
         * The float type is required by f or F, as double is default for decimals.
         *
         * 2^32 = 4 294 967 296
         */
        float floatNumber = 3.14F;

        /* -------------------------------------------------------------------------------
         * 64 bits
         * This can be specified explicitly by adding d or D at the end.
         *
         * 2^64 = 18 446 744 073 709 552 000
         */
        double doubleNumber = 3.14;
    }
}
