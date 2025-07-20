// Reverse String

public class ReverseString {
   public static String reverse(String str){
       StringBuilder reversed = new StringBuilder(str);
       return reversed.reverse().toString();
   }
    public static void main(String[] args){
       System.out.println(reverse("Hello"));
    }
}
