package Striver.BinarySearch;
// 977. [Easy] Squares of a Sorted Array
// TODO
public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = sortedSquares(nums);
        display(nums);
        display(ans);
    }
    public static int[] sortedSquares(int[] nums) {
        
        int[] out = new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        while(left<right){
            int numLeft = (int)Math.pow(nums[left],2);
            int numRight = (int)Math.pow(nums[right],2);
            if(numLeft > numRight){
                out[index--] = numLeft;
                left++;
            } 
            else if(numRight > numLeft){
                out[index--] = numRight;
                right--;
            }
            else{
                out[index--] = numLeft;
                out[index--] = numRight;
                left++;
                right--;
            }
        } 
        if(left==right) out[index] = (int)Math.pow(nums[left],2);
        return out;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
