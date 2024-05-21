package Striver.SlidingWindow;
// 209. [Medium] Minimum Size Subarray Sum
// TODO
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        display(nums);
        System.out.println(minSubArrayLen(target, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0;
      int j = 0;
      int sum = 0;
      int min = Integer.MAX_VALUE;
      while(j<nums.length) {
          sum += nums[j];
          if(sum < target){
          j++;
          }
          else {
              while(sum >= target) {
                  min = Math.min(min,(j-i+1));
                  sum -= nums[i];
                  i++;
              }
              j++;
          }
      }
      if(i==0) {
          return 0;
      }
      return min;
  }
  public static void display(int arr[]){
    for(int i : arr){
        System.out.print(i + " ");
    }
    System.out.println();
}
}
