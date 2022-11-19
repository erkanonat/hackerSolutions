package session1;

/* 
    finding greatest common divisor of two string 
 */

public class Solution2 {

    public static String gcdOfStrings(String str1, String str2) {
        
        if(str1.isEmpty())
            return str2;
        if (str2.isEmpty())
            return str1;
        if (str1.length() < str2.length() ) 
            return gcdOfStrings(str2, str1);
        if (!str1.startsWith(str2))
            return "";
        if (str2.length()==0 )
            return str1;
        return gcdOfStrings(str1.substring(str2.length()), str2);

    }

    public static boolean checkConcat(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n % m != 0)
            return false;
        for (int i = 0; i < n; i++) {
            if(s1.charAt(i) != s2.charAt(i%m))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1="ABAB";
        String str2="AB";

        System.out.println(gcdOfStrings(str1, str2));
    }
}
