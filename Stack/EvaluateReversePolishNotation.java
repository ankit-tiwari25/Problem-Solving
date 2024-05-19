package Striver.Stack;

import java.util.Stack;

// 150. [Medium] Evaluate Reverse Polish Notation
// TODO
public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
     public static int evalRPN(String[] tokens) {
         Stack<Integer> st=new Stack<Integer>();
        int a=0,b=0;
        for(String s: tokens){
            
            if(s.equals("+")){
                a=st.pop();
                b=st.pop();
                st.push(a+b);
            }
            else if(s.equals("-")){
                a=st.pop();
                b=st.pop();
                st.push(b-a);
            }
            else if(s.equals("*")){
                a=st.pop();
                b=st.pop();
                st.push(a*b);
            }
            else if(s.equals("/")){
                a=st.pop();
                b=st.pop();
                st.push(b/a);
            }
            else {
                st.push(Integer.parseInt(s));
            }
            
        }
        return st.pop();
    }
}
