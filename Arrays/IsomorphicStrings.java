package Striver.Arrays;

import java.util.HashMap;
import java.util.HashSet;

// 205. [Easy] Isomorphic Strings
// TODO : Need to do it again. Directly Copied;
public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(s);
        System.out.println(t);
        System.out.println(isomorphicStrings(s, t));
        
    }
    public static Boolean isomorphicStrings(String s, String t){
         HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for (int i=0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                Character p=map.get(s.charAt(i));
                if (p==t.charAt(i)){
                    continue;
                }
                else{
                    return false;
                }


            }
            else{
                map.put(s.charAt(i),t.charAt(i));
                if(set.contains(t.charAt(i))){
                    return false;
                }
                else{
                    set.add(t.charAt(i));
                }

            }
        }
        return true;
    }
}
