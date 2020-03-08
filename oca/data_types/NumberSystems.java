package data_types;

public class NumberSystems {

    @SuppressWarnings({"OctalInteger", "unused"})
    public static void main(String[] args) {

        /*
            1. Only 4 number systems: binary, octal, decimal, hexadecimal.
         */
        int binary  = 0b1;  // only numbers 0 or 1
        int octal   = 017;  // only numbers from 0 to 7, no 8 or 9
        int decimal = 24;   // only numbers from 0 to 9
        int hex     = 0xF;  // only 0-9, A, B, C, D, E, F
    }
}
