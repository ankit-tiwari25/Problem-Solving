package Striver.Arrays;

import java.util.HashMap;

// 560. Subarray Sum Equals K
// TODO : need to do this again (Directly copied)
public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int arr[] = {1,1,1};
        display(arr);
        int k = 2;
        System.out.println(subarraySumEqualToK(arr, k));
    }
    public static int subarraySumEqualToK(int[] nums, int k){
         int sum = 0;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int j=0;j<nums.length;j++){
            sum += nums[j];
            if(map.containsKey(sum -k)){
                ans += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
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
