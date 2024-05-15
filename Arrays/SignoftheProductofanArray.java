package Striver.Arrays;
// 1822[Easy]. Sign of the Product of an Array
// TODO : Directly copied
public class SignoftheProductofanArray {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,3,2,1};
        display(nums);
        System.out.println(arraySign(nums));
    }
    public static int arraySign(int[] nums) {
        int productSign = 1;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                productSign *= -1;
            }
        }

        if (productSign > 0)
            return 1;
        else 
            return -1;
        
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
