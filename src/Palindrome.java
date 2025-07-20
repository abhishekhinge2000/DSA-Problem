//Check if the String is palindrome

public class Palindrome {
    public static boolean isPalindrome(String str){
        int left = 0, right = str.length() - 1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("malayalam")); // true
        System.out.println(isPalindrome("abhi"));      // false
    }
}
