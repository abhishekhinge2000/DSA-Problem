// Return the index of the first non-repeating character in String

import java.util.*;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s){
        Map<Character, Integer> charCount = new HashMap<>();
        for(char c : s.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(charCount.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1; // no unique character found
    }
    public static void main(String[] args){
        System.out.println(firstUniqChar("leetcode")); // output: 0
        System.out.println(firstUniqChar("loveleetcode")); // output: 2
    }
}
