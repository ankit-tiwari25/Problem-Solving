package Striver.Stack;

import java.util.Stack;

// 735.[Medium] Asteroid Collision
// TODO
public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroid = {5,10,-5};
        int ans[] = asteroidCollision(asteroid);
        display(asteroid);
        display(ans);
    }
    public static int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> stack = new Stack<>();
        
        for (int a : asteroids) {
            if (a > 0) {
                stack.push(a);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -a) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0)  {
                    stack.push(a);
                }

                if (stack.peek() == -a) {
                    stack.pop();
                }
            }
        }

        int[] res = new int[stack.size()];
        int i = stack.size() - 1;

        while(!stack.isEmpty()) {
            res[i--] = stack.pop();
        }

        return res;     
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
