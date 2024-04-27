package Striver.Arrays;
//Problem 283 : Move Zeros
public class MoveZeros {
    public static void main(String[] args) {
        // Appraoch 1 : Brute Force
        // Appraoch 2 : Two Pointer
        int[] nums = {0,1,0,3,12};
        int[] arr = appraochTwo(nums);
        display(arr);
    }
    public static int[] appraochTwo(int[] nums){
        int n = nums.length;
        // Two pointer
        int i = 0;
        int j = 1;
        while(j < n){
            if(nums[i] == 0){
                if(nums[j] != 0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                }
            }else{
                i++;
            }
            j++;
        }
        return nums;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
