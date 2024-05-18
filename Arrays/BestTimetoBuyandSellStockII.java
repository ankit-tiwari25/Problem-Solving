package Striver.Arrays;

import java.util.List;

// 122. Best Time to Buy and Sell Stock II
//TODO : 
public class BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        display(nums);
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] prices) {
        int sum=0;
     for(int i=0;i<prices.length-1;i++)
     {
         if(prices[i]<prices[i+1])
         sum=sum+prices[i+1]-prices[i];
     }
     return sum;
 }
 public static void display(int[] arr){
        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
