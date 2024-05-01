package Striver.BinarySearch;
//704[Easy]. Binary Search
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};
        display(arr);
        System.out.println(binarySearch(arr, 3));
    }
    public static int binarySearch(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }

        }
        return -1;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
