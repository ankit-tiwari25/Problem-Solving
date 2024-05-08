package Striver.SlidingWindow;
// 1658[Medium]. Minimum Operations to Reduce X to Zero
//Need to go through this code again
public class MinimumOperationstoReduceXtoZero {
    public static void main(String[] args) {
        int[] arr = {1,1,4,2,3};
        int x = 5;
        display(arr);
        System.out.println(minimumOperationstoReduceXtoZero(arr, x));
    }

    public static int minimumOperationstoReduceXtoZero(int[] nums, int x){
        int n = nums.length;
        int targetSum = 0;
        
        for (int num : nums) {
            targetSum += num;
        }
        
        int windowSum = targetSum - x;
        
        if (windowSum < 0) {
            return -1; // It's not possible to reach x.
        }
        
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int currentSum = 0;
        
        for (int right = 0; right < n; right++) {
            currentSum += nums[right];
            
            while (currentSum > windowSum) {
                currentSum -= nums[left];
                left++;
            }
            
            if (currentSum == windowSum) {
                minLength = Math.min(minLength, n - (right - left + 1));
            }
        }
        
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
