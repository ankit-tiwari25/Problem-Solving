package Striver.Stack;

import java.util.Stack;

// 1209. [Medium] Remove All Adjacent Duplicates in String II
// TODO
public class RemoveAllAdjacentDuplicatesinStringII {
    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        int k = 3;
        System.out.println(removeDuplicates(s, k));
    }
      public static String removeDuplicates(String s, int k) {
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!charStack.isEmpty() && charStack.peek() == c) {
                countStack.push(countStack.pop() + 1);
            } else {
                countStack.push(1);
                charStack.push(c);
            }
            
            if (countStack.peek() == k) {
                countStack.pop();
                charStack.pop();
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            char currentChar = charStack.pop();
            int count = countStack.pop();
            for (int i = 0; i < count; i++) {
                result.insert(0, currentChar);
            }
        }
        
        return result.toString();
    }
}
