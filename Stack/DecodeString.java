package Striver.Stack;

import java.util.Stack;

// 394. [Medium] Decode String
// TODO
public class DecodeString {
    public static void main(String[] args) {
        String code = "3[a]2[bc]";
        System.out.println(decodeString(code));
    }
    public static  String decodeString(String s) {
         Stack<Integer> nums = new Stack<>();
        Stack<StringBuilder> chars = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int k = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                k = k * 10 + (int)(ch-'0');
            } else if(ch == '[') {
                nums.push(k);
                chars.push(curr);
                k = 0;
                curr = new StringBuilder();
            } else if(ch == ']') {
                StringBuilder lastStr = chars.pop();
                int lastK = nums.pop();
                while(lastK-- > 0) {
                    lastStr.append(curr);
                }
                curr = lastStr;
            } else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}
