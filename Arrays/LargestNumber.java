package Striver.Arrays;

import java.util.Arrays;
// 179[Medium]. Largest Number
// TODO : (Directly Copied)
public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {10,2};
        System.out.println(largestNumber(nums));
    }
    public static String largestNumber(int[] nums){
        String[] s = new String[nums.length];         
        for(int i=0; i<nums.length; i++)  s[i] = String.valueOf(nums[i]);
        Arrays.sort(s, (a,b) -> (b + a).compareTo(a + b));
        return s[0].equals("0") ? "0" : String.join("",s);
    }
}
