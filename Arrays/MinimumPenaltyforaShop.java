package Striver.Arrays;
// 2483[Medium]. Minimum Penalty for a Shop
// TODO : Directly copied
public class MinimumPenaltyforaShop {
    public static void main(String[] args) {
        String customers = "YYNY";
        System.out.println(bestClosingTime(customers));
    }
    public static int bestClosingTime(String customers) {
        int y=0, n=0;
       for(char ch: customers.toCharArray()){
           if(ch=='Y')
               y++;
           else
               n++;
       }
       int profit = n;
       int loss = y;
       int[] arr = new int[customers.length()+1];
       arr[0]=profit-loss;
       for(int i=1; i<=customers.length(); i++){
           char ch = customers.charAt(i-1);
           if(ch=='Y'){
               profit++;
           } else {
               loss++;
           }
           arr[i]=profit-loss;
       }
       int idx=0, max = Integer.MIN_VALUE;
       for(int i=0; i<=customers.length(); i++){
           if(arr[i]>max){
               max = arr[i];
               idx=i;
           }
       }
       return idx;
   }
}
