package Striver.BinarySearch;
// 162. [Medium] Find Peak Element
// TODO
public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int n=nums.length;
         int i=0,j=n-1,mid=0;
        while(i<=j){
        mid=i+(j-i)/2;
        if(mid+1>n-1||nums[mid]>nums[mid+1]){
           if(mid-1<0||nums[mid]>nums[mid-1])
           return mid;
           else
           j=mid-1;
        }
        else if(mid-1<0||nums[mid]>nums[mid-1])
        i=mid+1;
         else
        {
            if(nums[mid-1]>nums[mid+1])
            j=mid-1;
            else i=mid+1;
        }
        }
        return mid;    
    }
}
