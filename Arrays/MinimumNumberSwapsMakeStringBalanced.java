package Striver.Arrays;
// 1963[Medium]. Minimum Number of Swaps to Make the String Balanced
// TODO : Directly copied
public class MinimumNumberSwapsMakeStringBalanced {
    public static void main(String[] args) {
        String s ="][][";
        System.out.println(s);
        System.out.println(minimumNumberSwapsMakeStringBalanced(s));
    }
    public static int minimumNumberSwapsMakeStringBalanced(String s){
        int stack_size = 0;
        for (int i = 0; i < s.length (); i++) {
            char ch = s.charAt (i);
            if (ch == '[')
                stack_size++;
            else {
                if (stack_size > 0)
                    stack_size--;
            }
        }
        return (stack_size + 1) / 2;
    }
   
}
