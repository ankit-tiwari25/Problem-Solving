package Striver.Arrays;
// 1299[Easy]. Replace Elements with Greatest Element on Right Side
public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        int arr[] = {17,18,5,4,6,1};
        display(replaceElementsWithGreatestElementOnRightSide(arr));
    }
    public static int[] replaceElementsWithGreatestElementOnRightSide(int[] arr){
        int max = Integer.MIN_VALUE;
        int newArr[]  = new int[arr.length];
        newArr[arr.length-1] = -1; // Last element will always be -1
        for(int i = arr.length - 2; i >= 0; i--){
            int lastElement = arr[i + 1];
            max = Math.max(lastElement,max);
            newArr[i] = max;
        }
        return newArr;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
