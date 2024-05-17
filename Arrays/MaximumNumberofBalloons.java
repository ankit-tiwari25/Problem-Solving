package Striver.Arrays;
// 1189. Maximum Number of Balloons
// TODO : Directly copied

import java.util.HashMap;

public class MaximumNumberofBalloons {
    public static void main(String[] args) {
        String str = "nlaebolko";
        System.out.println(str);
        System.out.println(maxNumberOfBalloons(str));
    }
    public static int maxNumberOfBalloons(String text) {
          HashMap<Character,Integer> map=new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);
        
        for(int i=0;i<text.length();i++){
            if(map.containsKey(text.charAt(i)))
            map.put(text.charAt(i),map.get(text.charAt(i))+1);
        }
        map.put('l',map.get('l')/2);
        map.put('o',map.get('o')/2);
        int res=10000;
        for(char key:map.keySet()){
            
            if(map.get(key)<res)
            res=map.get(key);
        }
        return res;
    }
}
