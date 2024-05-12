package Striver.Arrays;
// 724. Find Pivot Index
// TODO : Need to do this again (Directly copied)
public class FindPivotIndex {
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        display(arr);
        System.out.println(findPivotIndex(arr));
    }
    public static int findPivotIndex(int[] nums){
           // Initialize total sum of the given array...
           int totalSum = 0;
           // Initialize 'leftsum' as sum of first i numbers, not including nums[i]...
           int leftsum = 0;
           // Traverse the elements and add them to store the totalSum...
           for (int ele : nums)
               totalSum += ele;
           // Again traverse all the elements through the for loop and store the sum of i numbers from left to right...
           for (int i = 0; i < nums.length; leftsum += nums[i++])
               // sum to the left == leftsum.
               // sum to the right === totalSum - leftsum - nums[i]..
               // check if leftsum == totalSum - leftsum - nums[i]...
               if (leftsum * 2 == totalSum - nums[i])
                   return i;       // Return the pivot index...
           return -1;      // If there is no index that satisfies the conditions in the problem statement...
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
