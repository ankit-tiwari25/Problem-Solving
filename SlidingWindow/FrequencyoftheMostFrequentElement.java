package Striver.SlidingWindow;

import java.util.Arrays;

// 1838.[Medium] Frequency of the Most Frequent Element
// TODO
public class FrequencyoftheMostFrequentElement {
    public static void main(String[] args) {
        int nums[] = {1,2,4};
        int k = 5;
        display(nums);
        System.out.println(maxFrequency(nums, k));
    }
      public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int max=0;
        for(int i=nums.length-1;i>=0;i--){
            int curr=1;
            int newK=k;
            int currEle=nums[i];
            for(int j=i-1;j>=0;j--){
                if(currEle-nums[j]<=newK){
                   curr++;
                   newK=newK-(currEle-nums[j]);
                }
                else{
                    break;
                }
            }
            max=Math.max(max,curr);
            if(max>=i){
                break;
            }

        }
        return max;
    
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
