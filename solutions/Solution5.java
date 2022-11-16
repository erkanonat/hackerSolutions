package solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Locale.LanguageRange;

public class Solution5 {
    
    public static int lengthOfLongestSubstring(String s) {
        
        String longestWord ="";
        
        for (int i =0 ; i<s.length(); i++) {
            HashSet<Character> word = new HashSet<>();
            for(int j=i; j<s.length(); j++) {
                if(!word.contains(s.charAt(j)))  
                    word.add(s.charAt(j)); 
                else
                    break;
            }
            if(longestWord.length()<word.size()) {
                StringBuilder sb = new StringBuilder();
                word.stream().forEach(elem->sb.append(elem));
                longestWord = sb.toString();
            }
        }
        return longestWord.length();    
    }

    public static void main(String[] args) {
            String test1 = "abcdcf";

            System.out.println(lengthOfLongestSubstring(test1));
    }

}
