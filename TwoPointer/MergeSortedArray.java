package Striver.TwoPointer;

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m = 3;
        int n = 3;
        int arr[] = mergeSortedArray(nums1, m, nums2, n);
        display(arr);
    }
    public static int[] mergeSortedArray(int[] nums1, int m, int nums2[], int n){
        int arr[] = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                arr[k] = nums1[i];
                i++;
            }else if(nums2[j] < nums1[i]){
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < m){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            arr[k] = nums2[j];
            j++;
            k++;
        }

        for( i = 0; i < m + n; i++){
            nums1[i] = arr[i];
        }
        return nums1;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
