package Striver.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 18.[Medium] 4Sum
//TODO
public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> arr = fourSum(nums, target);
        
        
    }
     public static List<List<Integer>> fourSum(int[] nums, int target) {
           Arrays.sort(nums); // Sort the input array to simplify the search
        
        List<List<Integer>> result = new ArrayList<>(); // List to store the quadruplets
        
        int n = nums.length;
        
        // Iterate through the array, fixing the first element of the quadruplet
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; 
            }
            
            // Early exit condition if the sum of the first four elements is greater than the target (for positive targets)
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target && target > 0) {
                break;
            }
            
            // Early exit condition if the sum of the first four elements is greater than the target (for negative targets with positive elements)
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target && target < 0 && i + 4 < n && nums[i + 4] > 0) {
                break;
            }
            
            // Early exit condition if the target is zero and there are positive numbers after the first four smallest elements
            if (target == 0 && i + 4 < n && nums[i + 4] > 0 && nums[i] > 0) {
                break;          
            }         
            
            // Early continue if the sum of the first element and the three largest elements is less than the target
            if ((long) nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3] < target && target > 0) {
                continue;
            }
            
            // Iterate through the remaining elements using a two-pointer approach
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicates
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; 
                }
                
                // Early exit condition if the target is zero and there are positive numbers after the first two smallest elements
                if (j < n - 1 && nums[j] > 0 && nums[j + 1] > 0 && target - nums[i] == 0) {
                    break;
                }
                
                // Early exit condition if the sum of the first three elements and the largest element is greater than the target
                if (target > 0 && nums[i] + nums[j] + nums[j + 1] > target - nums[i]) {
                    break;
                }
                
                // Early exit condition if the sum of the first three elements and the largest positive element is less than the target
                if (target < 0 && nums[i] + nums[j] + nums[j + 1] > target - nums[i] && j + 2 < n && nums[j + 2] > 0) {
                    break;
                }
                
                // Early continue if the sum of the first two elements and the two largest elements is less than the target
                if ((long) nums[i] + nums[j] + nums[n - 1] + nums[n - 2] < target && target >= 0) {
                    continue;
                }

                int left = j + 1; // Initialize left pointer
                int right = n - 1; // Initialize right pointer
                
                // Two-pointer approach to find the remaining two elements
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right]; // Calculate the sum
                    
                    if (sum == target) { // Quadruplet found
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // Add quadruplet to result
                        
                        // Skip duplicates
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        
                        left++; // Move left pointer
                        right--; // Move right pointer
                    } else if (sum < target) { // If sum is less than target, move left pointer to increase sum
                        left++;
                    } else { // If sum is greater than target, move right pointer to decrease sum
                        right--;
                    }
                }
            }
        }
        
        return result; // Return the list of quadruplets
    }
    public static void display(List<List<Integer>> arr){
        for(int i = 0; i < arr.size(); i++){
            List list = arr.get(i);
            for(int j = 0; j < list.size(); j++){
                Integer k = list.get(j);

            }

        }
        System.out.println();
    }
}
