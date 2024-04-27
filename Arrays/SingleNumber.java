package Striver.Arrays;
// Problem : 139 Single Number
public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        int k = 5;

        // int rotatedArray[] = rotateArrayApproachOne(arr, k);
        int singleNumber = singleNumber(arr);
        System.out.println(singleNumber);
        // display(rotatedArray);
    }
    public static int singleNumber(int[] nums){
        // XOR  lag jayega
        int x = nums[0];
        for(int i = 1; i < nums.length; i++){
            x = x ^ nums[i];
        }
        return x;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
