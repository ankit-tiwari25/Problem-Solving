package Striver.Arrays;

import java.util.HashSet;
import java.util.Set;

// 523[Medium]. Continuous Subarray Sum
// TODO : (Direclt copied)
public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] nums = {23,2,4,6,7};
        int k = 6;
        System.out.println(continuousSubarraySum(nums, k));
    }

    public static boolean continuousSubarraySum(int[] nums, int k){
         int n = nums.length;
        int [] sum = new int[n + 1];
        for(int i = 1; i <= n; i++){
            sum[i] = sum[i - 1] + nums[i -1];
        }
        
        Set<Integer> set = new HashSet();
        
        for(int i = 2; i <= n; i++){
            set.add(sum[i - 2] % k);
            if(set.contains(sum[i] % k)) return true;
        }
        return false;
    }

}
