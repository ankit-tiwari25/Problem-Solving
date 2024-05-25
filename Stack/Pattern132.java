package Striver.Stack;

import java.util.Stack;

// 456. [Medium] 132 Pattern
// TODO
public class Pattern132 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2};
        System.out.println(find132pattern(nums));
    }
      public static boolean find132pattern(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int cur=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<cur) return true;
            while(!st.isEmpty() && st.peek()<nums[i]){
                cur=st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}
