
public class Convert_string_to_camel_Case {
    public static void main(String[] args) {

        String str = "the-stealth-warrior";
        //String str = "The_Stealth_warrior";

        String newStr = "";
        boolean to_upper = false;

        for (int i = 0; i < str.length(); i++) {
            char addChar = str.charAt(i);
            switch (addChar) {
                case '-':
                case '_': to_upper = true;
                break;
                default: newStr += !to_upper ? addChar : Character.toUpperCase(addChar);
                         to_upper = false;
            }
        }
        System.out.println("Before: \"" + str + "\" After: \"" + newStr + "\"");
    }
}
