 package Striver.Arrays;
// Problem 26. Remove Duplicates From Sorted Array
class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
       // int arr[] = {1,1,2};
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int[] sortedArray = removeDuplicates(arr);

        for(int i : sortedArray){
            System.out.print(i+" ");
        }
    }

    public static int[] removeDuplicates(int[] nums){
        // Two pointer approach
        int unique = 1;
        for(int i = 0, j = 1; j < nums.length;){
            if(nums[i] == nums[j]){
                //move pointer
                j++;
            }else{
                // swap nums[j] -> nums[i + 1] also, i++
                nums[i + 1] = nums[j];
                unique++;
                i++;
                j++;
            }
            
        }
        System.out.println("Unique : " + unique);
        return nums;
    }
}