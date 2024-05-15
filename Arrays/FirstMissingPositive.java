package Striver.Arrays;
// 41[Hard]. First Missing Positive
//TODO : Directly copied
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        display(nums);
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
      
      // Place each positive integer i at index i-1 if possible
      for (int i = 0; i < n; i++) {
          while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
              swap(nums, i, nums[i] - 1);
          }
      }
      
      // Find the first missing positive integer
      for (int i = 0; i < n; i++) {
          if (nums[i] != i + 1) {
              return i + 1;
          }
      }
      
      // If all positive integers from 1 to n are present, return n + 1
      return n + 1;
  }
   public static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
  public static void display(int arr[]){
    for(int i : arr){
        System.out.print(i + " ");
    }
    System.out.println();
}

}
