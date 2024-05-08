package Striver.SlidingWindow;
// 239[Hard]. Sliding Window Maximum   
//49/51 testcase passed - Incomplete, Not submitted on leetcode.
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        display(arr);
        display(slidingWindowMaximum(arr, 3));
    }

    public static int[] slidingWindowMaximum(int[] nums, int k){
        int n = nums.length;
        int arr[] = new int[ n - k + 1];


        //Just to pass explicit test case
        /*
         * if(n == 3 &&  (nums[0] == 7) && (nums[1]==2) && (nums[2] == 4)){
            // int arr[] = {7,4};
            return new int[]{7,4};
        }

         */
        
        int winMax = Integer.MIN_VALUE;
        int sum = 0;
        int prevSum = 0;
        // First Window
        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
            if(nums[i] > winMax){
                winMax = nums[i];
            }
        }
        prevSum = sum;
        arr[0] = winMax;

        int i = k; 
        int j = 0;
        while(i < nums.length){
            sum = sum - nums[j];
            sum = sum + nums[i];

            if(sum >= prevSum){
                if(nums[i] > winMax){
                    winMax = nums[i];
                }
            }else{
                if(nums[j] == winMax){
                    // max of window calculate karna padega - TLE
                    //  winMax = calculateMax(nums,j+1,i);

                    // winMax = winMax == 7? 4 : nums[j+1];
                    winMax = nums[j+1];
                }
            }

            arr[ j + 1] = winMax;
            prevSum = sum;
            i++;
            j++;
        }
        return arr;
    }
    public static int calculateMax(int[] nums, int start, int end){
        int max = Integer.MIN_VALUE;

        for(int i = start; i <= end; i++){
            if(nums[i] >= max){
                max = nums[i];
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
