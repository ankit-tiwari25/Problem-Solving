package Striver.Arrays;

import java.util.ArrayList;

// 2348[medium]. Number of Zero-Filled Subarrays
//TODO : Directly copied
public class NumberofZeroFilledSubarrays {
    public static void main(String[] args) {
        int nums[] = {1,3,0,0,2,0,0,4};
        display(nums);
        System.out.println(zeroFilledSubarray(nums));
    }
     public static long zeroFilledSubarray(int[] nums) {
          int i = 0;
        long count = 0;
        ArrayList<Long> al = new ArrayList<>();
        while(i != nums.length){
            //if nums[i] == 0 increase the count
            if(nums[i] == 0){
                count++;
                i++;
                continue;
            }
            //if nums[i] != 0 then store the count in the array and 
            //re-initialize the count to 0
            else{
                //check if the count is 0 no need to store un-neccssary
                if(count != 0){
                    al.add(count);
                }
                count = 0;
            }
            i++;
        }
        //checking for the last element of the array if its 0 then store the count
        if(nums[nums.length-1] == 0){
            al.add(count);
        }
        long ans = 0;
        for(Long num : al){
            ans += (num*(num+1))/2;
        }
        return ans;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
