package Striver.SlidingWindow;
// 1456.[Medium] Maximum Number of Vowels in a Substring of Given Length
// TODO
public class MaximumNumberofVowelsinaSubstringofGivenLength {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(s);
        System.out.println(maxVowels(s, k));

    }
    public static int maxVowels(String s, int k) {
        int maxi = 0;
       int currvowel = 0;
       for (int i = 0; i < s.length(); i++) {
           if (i < k) {
               if (isVowel(s.charAt(i))) {
                   currvowel++;
               }
           } else {
               if (isVowel(s.charAt(i))) {
                   currvowel++;
               }
             if (isVowel(s.charAt(i - k))) {
                   currvowel--;
               }
           }
           if (i >= k - 1) {
               maxi = Math.max(maxi, currvowel);
           }
       }
       return maxi;
   }
   private static boolean isVowel(char c) {
       return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
   }
}
