package Striver.Arrays;
// Problem 268[Easy] : Missing Number 
public class MissingNumber {
    public static void main(String[] args) {
     //Approach 1 : Brute force - find each issing no. TC = O{n2}, SC = O(1)
     //App.2 : Sort and search : T.C = O(nlogn), SC = O(1)
     //App.3 : Using Hashset   : T.C = O(n), S.C = O(n)
     //App.4 : Sum of n natural numbers : T.C = O(n), SC = O(1)

     //Approach 4
     int nums[] = {9,6,4,2,3,5,7,0,1};
     System.out.println(appraochFour(nums));
     
    }
    public static int appraochFour(int[] nums){
        int n = nums.length;
     int sum = 0;
     for(int i : nums){
        sum = sum + i;
     }

     int requiredSum = (n * (n + 1))/2;
     int diff = requiredSum - sum;

     return diff;
    }

}
