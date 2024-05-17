package Striver.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// 496[Easy]. Next Greater Element I
public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        display(nums1);
        display(nums2);
        int[] ans = nextGreaterElement(nums1, nums2);
      
        display(ans);

        
    }
     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
         Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();

        if(nums1.length==0 || nums2.length==0)
            return new int[0];

        for(int i=nums2.length-1;i>=0;i--){
            
            if(!stack.isEmpty() ){
                while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                    stack.pop();
                }
            }
            
            if(stack.isEmpty()){
               map.put(nums2[i],-1);
            }else{
               map.put(nums2[i],stack.peek());
            }

            stack.push(nums2[i]);
        }

        for(int j=0;j<nums1.length;j++){
            nums1[j]=map.get(nums1[j]);
        }

        return nums1;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
