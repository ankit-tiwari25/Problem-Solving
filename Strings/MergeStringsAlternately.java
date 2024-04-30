package Striver.Strings;
// Problem 1768[Easy]. Merge Strings Alternately
public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abc"    ;
        String word2 = "pqr";

        System.out.println(mergeStringAlternately(word1, word2));
    }
    public static String mergeStringAlternately(String word1, String word2){
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i < word1.length() || i < word2.length()){
            if(i < word1.length()){
                ans.append(word1.charAt(i));
            }
            if(i < word2.length()){
                ans.append(word2.charAt(i));
            }
            i++;
        }
        return ans.toString();
    }

}
