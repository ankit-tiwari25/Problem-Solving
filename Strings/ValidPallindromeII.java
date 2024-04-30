package Striver.Strings;
// 680. Valid Palindrome II
/*
 * Approach : For every mismatch character, skip left side and check pallindrome
 *             if not true, skip right side and check pallindrome
 *              if both are false return false 
 */
public class ValidPallindromeII {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(validPallindromeII(str));
    }
    public static boolean validPallindromeII(String s){
        int start = 0;
        int end = s.length() - 1;

        while(start < end){

            if(s.charAt(start) == s.charAt(end)){
                start++;
                end++;
            }else{
                boolean skipLeft = isPallindorme(s,start + 1, end);
                boolean skipRight = isPallindorme(s,start, end - 1);

                return skipLeft || skipRight;
            }

        }
        return true;
    }
    public static boolean isPallindorme(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
