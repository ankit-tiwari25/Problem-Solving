package Striver.Arrays;
// 2016.[Easy] Maximum Difference Between Increasing Elements
public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String[] args) {
        int nums[] = {87,68,91,86,58,63,43,98,6,40};
        display(nums);
        System.out.println(maximumDifferenceBetweenIncreasingElements(nums));
    }
    public static int maximumDifferenceBetweenIncreasingElements(int[] nums){
        int maxDiff = 0;
        int currentEle = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < currentEle){
                currentEle = nums[i];
            }
            if(nums[i] - currentEle > maxDiff){
                maxDiff = nums[i] - currentEle;
            }
        }
        return maxDiff;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
