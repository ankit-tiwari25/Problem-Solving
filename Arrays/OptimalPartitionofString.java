package Striver.Arrays;
// 2405[medium]. Optimal Partition of String
// TODO : Directly copied
public class OptimalPartitionofString {
    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(s);
        System.out.println(partitionString(s));
    }
    public static int partitionString(String s) {
        StringBuilder lookup = new StringBuilder();
      int ans = 0; 
      for(int i = 0;i < s.length();i++)
      {  
          char c = s.charAt(i);
          if(lookup.indexOf(c+"") != -1)
          {
               ans++;
            lookup.setLength(0);
               
          }

          lookup.append(c);      
      }
       if(lookup.length() == s.length())
         return 1;

     
        if(lookup.length() != 0) 
         ans += 1;
   return ans ;
   }
}
