package Striver.BinarySearch;

import java.util.Arrays;

// 2616. [Medium] Minimize the Maximum Difference of Pairs
// TODO
public class MinimizetheMaximumDifferenceofPairs {
    public static void main(String[] args) {
        int[] nums = {10,1,2,7,1,3};
        int p = 2;
        System.out.println(minimizeMax(nums, p));
    }
     public static int minimizeMax(int[] nums, int p) {
         if (p == 0)  return 0;
        if (nums.length <= 2)  return Math.abs(nums[0] - nums[1]);
        Arrays.sort(nums);
        int[] diffs = new int[nums.length - 1];
        int right = 0;
        int left  = 1_000_000_001;
        for (int i = nums.length - 2; i >= 0; i--) {
            right = Math.max(right, (diffs[i] = nums[i + 1] - nums[i]));
            left  = Math.min(left,  diffs[i]);
        }
        if (left == right)  return left;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isValid(mid, diffs, p)) 
                right = mid;
            else 
                left = mid + 1;
        }
        return left;
    }
     private static boolean isValid(int guess, int[] diffs, int p) {
        int count = p;
        for (int i = diffs.length - 1; i >= 0; i--) {
            if (diffs[i] <= guess) {
                if (--count <= 0)  return true;
                i--;
            }
        }
        return false;
    }
    
}
