package Striver.BinarySearch;
// 35[Easy]. Search Insert Position
public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int target = 5;
        display(arr);
        System.out.println(searchInsertPosition(arr, target));

    }
    public static int searchInsertPosition(int[] nums, int target){
         //Binary search
         int start = 0;
         int end = nums.length-1;
 
         while (start <= end) {
             int mid = start + (end-start)/2;
             if (nums[mid] == target) return mid;
             else if (nums[mid] > target) end = mid-1;
             else start = mid+1;
         }
 
         return start;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
