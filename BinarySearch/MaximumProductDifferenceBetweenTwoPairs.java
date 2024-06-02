

// 1913. [Easy]Maximum Product Difference Between Two Pairs

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        System.out.println(maxProductDifference(nums));
    }
    public static int maxProductDifference(int[] nums) {
        int firstBig = 0, secondBig = 0;
       int firstSmall = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;

       for (int n : nums) {
           if (n < firstSmall) {
               secondSmall = firstSmall;
               firstSmall = n;
           } else if (n < secondSmall) {
               secondSmall = n;
           }

           if (n > firstBig) {
               secondBig = firstBig;
               firstBig = n;
           } else if (n > secondBig) {
               secondBig = n;
           }
       }

       return firstBig * secondBig - firstSmall * secondSmall; 
   }
}
