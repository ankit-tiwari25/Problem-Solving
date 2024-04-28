package Striver.Arrays;
//Problem 153[Medium] : Find Minimum in Rotated Sorted Array
public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        System.out.println(findMinimumInRotatedSortedArray(nums));
    }
    public static int findMinimumInRotatedSortedArray(int[] nums){
        int l = 0;
        int r = nums.length-1;

        while(l < r){
            int mid = l + (r-l)/2;
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return nums[r];
    }
}
