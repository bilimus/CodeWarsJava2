//public class Scramblies {
//    public static void main(String[] args) {
//        //String str1 = "rkqodlw";
//        //String str2 = "world";
//        String str1 ="cedewaraaossoqqyt";
//        String str2 = "codewars";
//
//        boolean status = true;
//
//        int lngStr2 = str2.length();
//
//        char[] chr2 = new char[lngStr2];
//        str2.getChars(0, lngStr2, chr2, 0);
//        for(char ch : chr2){
//            if(str1.indexOf(ch)==-1)
//               status = false;
//        }
//        System.out.println("Status is: " + status);
//    }
//}
public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        boolean status = true;

        int lngStr2 = str2.length();

        char[] chr2 = new char[lngStr2];
        str2.getChars(0, lngStr2, chr2, 0);
        for(char ch : chr2){
            if(str1.indexOf(ch)==-1)
                status = false;//status = false;
        }
        return status;
    }
}