public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if(isPalindrome(s) == true){
                System.out.println(s + " - палиндром");
            }
            else {
                System.out.println(s + " - не палиндром");
            }
        }
    }
    public static boolean isPalindrome(String s){
        String reverseString = reverseString(s);
        if (s.equals(reverseString)){
            return true;
        }
        else
        {
            return false;
        }
    }
    public static String reverseString(String input) {
        String output = "";
        for(int i = input.length() ; i >= 0; i--){
            output += input.charAt(i);
        }
        return output;
    }
}
