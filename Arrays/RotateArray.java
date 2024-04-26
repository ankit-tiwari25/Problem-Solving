package Striver.Arrays;

//Problem 189 [Medium]  : Rotate Array k times

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 9;

        int rotatedArray[] = rotateArrayApproachOne(arr, k);
        display(rotatedArray);

    }
    
    
    public static int[] rotateArrayApproachOne(int[] nums, int k){

        // Directly copy values using index.
        int n = nums.length;
        int arr[] = new int[n];
         k = k % n;

        //start from k and copy n-k ele from nums to arr

        for(int i = n-k, j = 0; i < n; i++,j++){
            arr[j] = nums[i];
        }

        //copy starting elements
        for(int i = 0, j = k; i < n - k; i++, j++){
            arr[j] = nums[i];
        }

        return arr;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    
    
}
