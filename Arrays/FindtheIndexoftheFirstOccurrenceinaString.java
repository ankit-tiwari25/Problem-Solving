package Striver.Arrays;
// 28.[Easy] Find the Index of the First Occurrence in a String
// TODO
public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(haystack);
        System.out.println(needle);
        System.out.println(strStr(haystack, needle));

    }
    public static int strStr(String haystack, String needle) {
        int haylength=haystack.length();
       int needlelength=needle.length();
       if(haylength<needlelength)
           return -1;
       for(int i=0;i<=haystack.length()-needle.length();i++){
           int j=0;
           while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
               j++;
           if(j==needle.length()){
               return i;
           }
       }
       return -1;
   }
}
