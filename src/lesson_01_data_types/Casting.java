package lesson_01_data_types;

public class Casting {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        /* -------------------------------------------------------------------------------
         * byte has range -128 to 127
         */
        byte b  = -128;              // int literal in range, no cast required
        byte b2 = (byte) 128;        // int literal exceed range, cast required

        byte b3 = 126;
        byte b4 = 1;
        byte b5 = (byte) (b3 + b4);  // b3 and b4 promoted to int, cast required

        byte b6 = 126;
        byte b7 = (byte) (b6 + 1);   // b6 and 1 promoted to int, cast required
    }
}
