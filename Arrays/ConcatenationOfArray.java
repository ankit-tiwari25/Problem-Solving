package Striver.Arrays;
//Problem 1929[Easy]. Concatenation of Array
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int arr[] = {1,3,2,1};
        display(concatenationOfArray(arr));
    }
    public static int[] concatenationOfArray(int[] nums){
        int arr[] = new int[nums.length * 2];

        for(int i = 0, j = nums.length; i < nums.length; i++,j++){
            arr[i] = nums[i];
            arr[j] = nums[i];
        }
        return arr;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
