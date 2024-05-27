package Striver.BinarySearch;
// 1011. [Medium] Capacity To Ship Packages Within D Days
//TODO
public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int max=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            max=Math.max(max,weights[i]);
        }
        int l=max;
        int h=sum;
        while(l<=h){
            int mid=(l+h)/2;
            if(finDays(weights,mid)<=days){
                h=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return l;
    }

    public static int finDays(int[] weights, int weight){
        int day=0;
        for(int i=0;i<weights.length;i++){
            int count=0;
            while(i<weights.length && count+weights[i]<=weight){
                count+=weights[i];
                i++;
            }
            day++;
            i--;
        }
        return day;
    }
    
}
