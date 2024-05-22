package Striver.SlidingWindow;
// 658. [Medium] Find K Closest Elements
//TODO

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKClosestElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int x = 3;
        int k = 4;
        // List l =  Arrays.asList(arr);
        // display(l);
        List<Integer> list = findClosestElements(arr, k, x);
        display(list);
    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start=0;
		long sum=0;
		long min=(long)1e9;
		int ai=-1,aj=-1;
		for(int i=0;i<arr.length;i++){
			sum+=Math.abs(arr[i]-x);
			while(i-start+1>k){
				sum-=Math.abs(arr[start++]-x);
			}
			if(i-start+1==k && sum<min){
				min=sum;
				ai=start;
				aj=i;
			}
		}
		List<Integer> list= new ArrayList<>();
		for(int i=ai;i<=aj;i++){
			list.add(arr[i]);
		}

		return list;
    }
    public static void display(List<Integer> arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
