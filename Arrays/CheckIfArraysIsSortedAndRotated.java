package Striver.Arrays;
// Problem : 1752 on leet code
public class CheckIfArraysIsSortedAndRotated {
    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};
        int nums2[] = {1,1,1,1,1};
        System.out.println(appraochTwo(nums));
    }

    public static boolean approachOne(int nums[]){
        /*
         * max nikala maxIndex nikala
         * min nikala and minIndex nikala
         * if(minIndex = 0 and maxIndex = n.length - 1) --> Return true (rotated zero times)
         * or if(maxIndex - minIndex == 1) --Return true
         * 
         * Galat appraoch
         * Test case failed : [1,1,1,1]
         */
        //Approach
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
            if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
        }

        if(maxIndex == nums.length - 1 && minIndex == 0){
            return true;
        }

        return  minIndex - maxIndex == 1 ? true : false;
      
    }

    public static boolean appraochTwo(int[] nums){
        //count -> count of flips required to get a sorted array

        int count = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                count++;
            }
        }

        if(nums[0] < nums[nums.length - 1]){
            count++;
        }
        if(count <= 1){
            return true;
        }

        return false;
    }
}
