package Striver.Arrays;

import java.util.HashMap;
import java.util.Map;
// 2001. Number of Pairs of Interchangeable Rectangles
// TODO : (Directly copied)
public class NumberofPairsofInterchangeableRectangles {
   public static void main(String[] args) {
        int rectangles[][] = {{4,8},{3,6},{10,20},{15,30}};
        System.out.println(numberofPairsofInterchangeableRectangles(rectangles));
   }
   public static long numberofPairsofInterchangeableRectangles(int[][] rectangles) {
    Map<Double,Long> mp = new HashMap<Double,Long>();
        long anss = 0;
         for(int i=0;i<rectangles.length;i++){
          //ratio.push_back(((double)rectangles[i][0]/rectangles[i][1]));
          double ans = (double)rectangles[i][0]/rectangles[i][1];
          mp.put(ans,mp.get(ans)==null?1:mp.get(ans)+1);
        } 
     //   System.out.println(mp);
        for(Map.Entry<Double,Long> mpp:mp.entrySet()){
         // System.out.println(mpp.getValue());
          long temp = (long)(mpp.getValue())-1;
          anss+= (temp*(temp+1))/2;
        }
        return anss;
   }
}
