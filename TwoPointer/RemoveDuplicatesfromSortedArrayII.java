package Striver.TwoPointer;
//80. [Medium] Remove Duplicates from Sorted Array II
public class RemoveDuplicatesfromSortedArrayII {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        display(arr);
        System.out.println(removeDuplicates(arr));

    }
    public static int removeDuplicates(int[] nums) {
        //Two pointer approach
          int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (j == 1 || nums[i] != nums[j - 2]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
