package Striver.SlidingWindow;
//1343[Medium]. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
public class NumberofSubarraySizeKAndAverageGreaterThanEqualToThreshold {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int t = 4;

        display(arr);
        System.out.println(numberofSubarraySizeKAndAverageGreaterThanEqualToThreshold(arr, k, t));
    }
    public static int numberofSubarraySizeKAndAverageGreaterThanEqualToThreshold(int[] arr, int k, int threshold){
        int count = 0;
        int avg = 0;
        int sum = 0;
        //First Window
        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }

        avg = (int)(sum / k);

        if(avg >= threshold){
            count++;
        }

        for(int i = k, j = 0; i < arr.length; i++, j++){
            sum = sum - arr[j];
            sum = sum + arr[i];

            avg = (int)(sum / k);

             if(avg >= threshold){
                   count++;
             }
        }
        return count;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    
}
