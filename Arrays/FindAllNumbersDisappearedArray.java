package Striver.Arrays;

import java.util.ArrayList;
import java.util.List;

// 448. [Easy] Find All Numbers Disappeared in an Array
// TODO : directly copied
public class FindAllNumbersDisappearedArray {
    public static void main(String[] args) {
        int nums1[] = {4,3,2,7,8,2,3,1};
        List<Integer> arr = findDisappearedNumbers(nums1);
        display(arr);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
         boolean[] isAvailable = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            isAvailable[nums[i]-1] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<isAvailable.length;i++){
            if(!isAvailable[i]){
                ans.add(i+1);
            }
        }
        return ans;
    }
    public static void display(List<Integer> arr){
        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
