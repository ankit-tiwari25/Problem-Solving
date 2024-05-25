package Striver.Stack;

import java.util.ArrayDeque;

// 402. [Medium] Remove K Digits
// TODO
public class RemoveKDigits {
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(removeKdigits(num,k));
    }
     public static String removeKdigits(String num, int k) {
       int n = num.length();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char c : num.toCharArray()) {
            while (!stack.isEmpty() && stack.peek() > c && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.reverse();

        // Remove leading zeros
        int start = 0;
        while (start < sb.length() && sb.charAt(start) == '0') {
            start++;
        }

        sb = sb.delete(0, start);

        // If the string is empty, return "0"
        if (sb.length() == 0) {
            return "0";
        }

        return sb.toString(); 
    }

}
