package Striver.SlidingWindow;

import java.util.HashMap;

// 904.[Medium] Fruit Into Baskets
//TODO
public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {1,2,1};
        display(fruits);
        System.out.println(totalFruit(fruits));
    }
    public static int totalFruit(int[] fruits) {
         
    int left = 0, right = 0, max = 0;
    int n = fruits.length;
    HashMap<Integer, Integer> map = new HashMap<>();

    while (right < n) {
        // Perform operation on right
        map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

        // If map size exceeds N, reduce the window from the left
        while (map.size() > 2) {
            int leftKey = fruits[left];
            int leftValue = map.get(leftKey) - 1; // Decrementing the count of left element
            map.put(leftKey, leftValue); // Updating the decremented new value
            // If value is 0 then remove that element
            if (map.get(leftKey) == 0) {
                map.remove(leftKey);
            }
            // Operation is done, increment left
            left++;
        }
        // Compute the max length
        if(map.size()<=2)max = Math.max(max, right - left + 1);
        // After computing all of it, increment right to calculate for the next value
        right++;
    }
    return max; 
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
