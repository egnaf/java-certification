package data_types;

public class VariableNaming {

    @SuppressWarnings({"unused", "NonAsciiCharacters"})
    public static void main(String[] args) {

        /*
            1. The variable name must start with: _, $ or letters.
         */
        String name;
        String $name;
        String _name;

        /*
            2. Other characters may be: _, $, letters, numbers.
        */
        String name1;
        String first_name;
        String last_$$_name;
        String имя_фамилия; // Non Ascii Characters also allowed
    }
}
