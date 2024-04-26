package Striver.Arrays;

//Problem 189 [Medium]  : Rotate Array k times
/*
 * Appraoch 1 : Directly using index : T.C=O(n)  S.C = O(n)
 * Appraoch 2 : Reversing elements   : T.C =O(n) S.C = O(1) -> Most Optimal Appraoch
 */

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 5;

        // int rotatedArray[] = rotateArrayApproachOne(arr, k);
        int rotatedArray[] = rotateArrayApproachTwo(arr, k);
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

    public static int[] rotateArrayApproachTwo(int nums[], int k){
        // Without using extra space : Reversing array elements
        /* 1. Reverse entire array
         * 2. Reverse 0-k elements
         * 3. Reverse k - n elements
         */
        int n = nums.length;
        k = k % n;

        //1. Reversing entire elements
        for(int i = 0, j = n -1; i <= j; i++, j--){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }

        display(nums);
        //2. Reversing 0-k elements
        for(int i = 0, j = k-1; i <= j; i++, j--){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
                display(nums);

        //3. Reversing k - n elements
        for(int i = k, j = n -1; i <= j; i++, j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        display(nums);


        return nums;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    
    
}
