package Striver.TwoPointer;

import java.util.Arrays;

//881. Boats to Save People
public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] arr = {3,5,3,4};
        int limit = 5;
        display(arr);
        System.out.println(boatsToSavePeople(arr, 0));
    }
    public static int boatsToSavePeople(int[] people, int limit){
        //Through sorting and two pointer
        int boat = 0;
        Arrays.sort(people);

        int i = 0, j = people.length -1;

        while(i <= j){
            if((people[i] + people[j]) <= limit){
                i++;
            }
            j--;
            boat++;
        }
        return boat;
    }   
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
