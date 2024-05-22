package Striver.Stack;

import java.util.Stack;

// 2390. [Medium] Removing Stars From a String
// TODO
public class RemovingStarsFromaString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
     public static String removeStars(String s) {

        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        String ans="";
        for(char e:stack){
            ans+=e;
        }
        return ans; 
    }
}
