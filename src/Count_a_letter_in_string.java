public class Count_a_letter_in_string {
    public static void main(String[] args) {
        int count = 0;
        char searchChr = 'a';
        String str = "Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit, sed do eiusmod tempor incididunt" +
                " ut labore et dolore magna aliqua";

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == searchChr)
                count ++;
        }
        System.out.println("The number of the char \"" + searchChr + "\" in the given text is: " + count +".");
    }
}
