package data_types;

public class InitializingVariables {

    static String var = "It's a static variable.";

    @SuppressWarnings({"unused", "ConstantConditions"})
    public static void main(String[] args) {

        /* -------------------------------------------------------------------------------
         * Initializing variables:
         * 1. Local variables must be initialised before use.
         * 2. Class and instance variables are given a default value.
         */
        boolean var1 = false;
        byte var2    = 0;
        short var3   = 0;
        int var4     = 0;
        long var5    = 0L;
        char var6    = '\u0000';
        float var7   = 0.0f;
        double var8  = 0.0;

        /* -------------------------------------------------------------------------------
         * Local variables can NOT be initialised within conditional code
         * as there is a chance that they won't be initialised.
         */
        int someNumber;
        String today = "Wednesday";

        if (today.equals("Thursday")) {
            someNumber = 1;
        }
        // System.out.println(someNumber); will cause error

        /* -------------------------------------------------------------------------------
         * Static variables are initialized as soon as the class is created
         * and last the entire program.
         */
        System.out.println(InitializingVariables.var);
    }
}
