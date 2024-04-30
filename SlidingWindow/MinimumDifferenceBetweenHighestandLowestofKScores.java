package Striver.SlidingWindow;

import java.util.Arrays;

//1984[Easy]. Minimum Difference Between Highest and Lowest of K Scores
/*
 * Appraoch : Sort + Sliding window
 */
public class MinimumDifferenceBetweenHighestandLowestofKScores {
    public static void main(String[] args) {
        int arr[] = {9,4,1,7};
        int k = 2;
        System.out.println(minimumDifferenceBetweenHighestandLowestofKScores(arr,k));
    }
    public static int minimumDifferenceBetweenHighestandLowestofKScores(int[] arr, int k){
        if(arr.length == 1){
            return 0;
        }

        Arrays.sort(arr);
        int i = 0;
        int j = k - 1;
        int min = Integer.MAX_VALUE;
        
        while(j < arr.length){
            min = Math.min(min, (arr[j] - arr[i]));
            i++;
            j++;
        }
        return min;
    }
}
