package Striver.Arrays;

public class SortColors {

    //75 [Medium]. Sort Colors
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        display(sortColors(arr));
    }
    public static int[] sortColors(int[] nums){
         // Count no of 0s, 1s and 2s 

         int countZero = 0;
         int countOne = 0;
         int countTwo = 0;
 
         for(int i : nums){
             if(i == 0){
                 countZero++;
             }else if(i == 1){
                 countOne++;
             }else{
                 countTwo++;
             }
         }
 
         for(int i = 0; i < nums.length ; i++){
             if(countZero != 0){
                 nums[i] = 0;
                 countZero--;
             }else if( countOne != 0){
                 nums[i] = 1;
                 countOne--;
             }else{
                 nums[i] = 2;
             }
         }
         return nums;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
