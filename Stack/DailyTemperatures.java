package Striver.Stack;

import java.util.Stack;

// 739. [Medium] Daily Temperatures
//TODO
public class DailyTemperatures {
    public static void main(String[] args) {
        int temp[] = {73,74,75,71,69,72,76,73};
        int ans[] = dailyTemperatures(temp);
        display(temp);
        display(ans);
    }
    public static int[] dailyTemperatures(int[] temperatures) {
           int[] results = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
      
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                results[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return results;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
