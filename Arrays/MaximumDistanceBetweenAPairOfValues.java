package Striver.Arrays;
// 1855. Maximum Distance Between a Pair of Values
public class MaximumDistanceBetweenAPairOfValues {
    public static void main(String[] args) {
        int nums1[] = {30,29,19,5};
        int nums2[] = {25,25,25,25,25};
        System.out.println(maximumDistanceBetweenAPairOfValues(nums1, nums2));
        System.out.println(solution2(nums1, nums2));
    }
    public static int maximumDistanceBetweenAPairOfValues(int[] nums1, int[] nums2){
        int max = 0;
        int diff =0;
        int p1 =0;
        int p2 = 0;
        while(p1<nums1.length && p2<nums2.length){
            if(nums2[p2] >= nums1[p1]){
                diff = p2 -p1;
                max = Math.max(max,diff);
                p2++;
            }
            else{
                p1++;
            }
            
        }
        return max;
    }

    public static int solution2(int[] nums1, int[] nums2){
        // My Solution : 30 out of 32 test cases passed
         //Trying with two pointer
         int j = nums2.length - 1;
         int i = nums1.length - 1;
         if(nums1.length > nums2.length){
             i = j;
         }
      
         
         int maxDistance = Integer.MIN_VALUE;
         int pairs = 0;
 
         while(i >= 0 && j >= 0){
 
             if(nums1[i] <= nums2[j]){
                 //Valid pair
                 pairs++;
                 int distance = j - i;
                 maxDistance = Math.max(distance, maxDistance);
                 i--;
             }else{
                 j = i - 1;
                 i = i - 1;
 
             }
         }
         return pairs == 0 ? 0 : maxDistance;
    }
}
