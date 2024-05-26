package Striver.BinarySearch;
// 540. [Medium] Single Element in a Sorted Array
// TODO
public class SingleElementinSortedArray {
    public static void main(String[] args) {
        int nums[] = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
           return nums[0];
       }
       int i=0;
       int j=nums.length-1;
       while(i<j){
           int mid=(i+j)/2;
           if(mid%2==0){
               if(nums[mid]==nums[mid+1]){
                   i=mid;
               }
               else{
                   j=mid;
               }
           }
           else{
               if(nums[mid-1]==nums[mid]){
                   i=mid+1;
               }
               else{
                   j=mid-1;
               }
           }
       }
       return nums[i];
   }
}
