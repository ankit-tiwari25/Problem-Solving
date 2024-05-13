package Striver.Arrays;

// 290[Easy]. Word Pattern
// TODO : (Directly copied)

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String sentence = "dog cat cat dog";
        System.out.println(wordPattern(pattern, sentence));
        

    }
    public static boolean wordPattern(String s, String t) {
        String[] tt = t.split(" ", -1);
                  if(s.length() != tt.length){
                      return false;
                  }
                      HashMap<Character, String> a = new HashMap<>();
                      for (int i = 0; i < s.length(); i++) {
                          if(a.containsKey(s.charAt(i))){
                              String res=a.get(s.charAt(i));
                              if(!res.equals(tt[i]))
                                   {
                                      return false;
                                  }
                          }
                          else if(a.containsValue(tt[i])){
                              return false;
                          }
                          else{
                              a.put(s.charAt(i), tt[i]);
                          }
                      }
                                         
                      return true;
      }
}
