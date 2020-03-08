package data_types;

public class ByteType {

    public static void main(String[] args) {

        /* Dimensions */
        byte byteMin = -128; // max value
        byte byteMax = 127;  // min value

        System.out.println(byteMin); // -128
        System.out.println(byteMax); // 127
        System.out.println(++byteMax); // -128


        /* Up casting */
        byte param = 5;
        short a   = param; // 5
        int b     = param; // 5
        long c    = param; // 5
        float d   = param; // 5.0f
        double e  = param; // 5.0d
        char f    = (char) param;  // ' '
        // boolean g = (boolean) param; <- wrong

        /* Down casting */
        byte h  = (byte) 128;    // -128
        byte i  = (byte) 5L;     // 5
        byte j  = (byte) 100.0f; // 100
        byte k  = (byte) 100.0d; // 100
        byte l  = 'a';           // 97
        // byte m  = (char) true; <- wrong
    }
}
