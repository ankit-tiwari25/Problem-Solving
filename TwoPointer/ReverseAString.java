package Striver.TwoPointer;
//Problem 344 [Easy] : Reverse a String
public class ReverseAString {
    public static void main(String[] args) {
        char[] st = {'H','a','n','n','a','h'};
        System.out.println(reverseAString(st));
    }
    public static char[] reverseAString(char[] s){
        for(int i = 0, j = s.length-1; i<=j; i++,j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        return s;
    }
}
