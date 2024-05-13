package Striver.Arrays;
// 912[Medium]. Sort an Array
//TODO : Directly copied

public class SortanArray {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1};
        int[] sort = sortAnArray(arr);
        display(arr);
        display(sort);
        
    }
    public static int[] sortAnArray(int[] nums){
        int n =  50001;
        int pos[] = new int[n]; //Storing the count of positive no
        int neg[] = new int[n]; //Storing the count of negative no
        for(int i:nums){ //Do the count for negative and positive values
            if(i>=0) pos[i]++;
            else neg[i*-1]++;
        }
        int total=nums.length;
        int ans[]  = new int[total];
        int index = 0;

        //Now first get the negative values, Since if there is any 
        //It should come first
        for(int i=n-1;i>=0;i--){ 
            if(neg[i]>0)
                for(int jj = 0;jj<neg[i];jj++)
                    ans[index++] = i*-1;
        }
        //Do the count for positive in ans array
        for(int i=0;i<n;i++){
            if(pos[i]>0) 
            for(int jj = 0;jj<pos[i];jj++)
                ans[index++] = i;
        }

        //Return ans
        return ans;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
