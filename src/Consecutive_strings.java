public class Consecutive_strings {
    public static void main(String[] args) {
        //String[] strarr = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        //String[] strarr = {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"};
        String[] strarr = {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"};
        int k = 1;

        int lnStr = 0;
        int tmpLnStr = 0;
        String longStr = "";
        String finalStr = "";

        for (int i = 0; i <= strarr.length - k; i++) {
            for (int j = 0; j < k; j++) {
                longStr += strarr[i + j];
            }
            tmpLnStr = longStr.length();
            if (lnStr < tmpLnStr) {
                lnStr = tmpLnStr;
                finalStr = longStr;
            }

            longStr = "";
        }
        System.out.println(finalStr);
    }
}
