package Striver.BinarySearch;

import java.util.Arrays;

// 2300. [Medium] Successful Pairs of Spells and Potions
//TODO
public class SuccessfulPairsofSpellsandPotions {
    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        long success = 7;
        int[] ans = successfulPairs(spells, potions, success);
        System.out.println("Spells");
        display(spells);
        System.out.println("Potions");
        display(potions);
        System.out.println("Answer");
        display(ans);
    }
     public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        Arrays.sort(potions);
        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            int left = 0;
            int right = m - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long product = (long) spell * potions[mid];
                if (product >= success) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            pairs[i] = m - left;
        }
        return pairs;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
