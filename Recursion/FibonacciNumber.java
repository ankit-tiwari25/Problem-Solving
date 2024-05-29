package Striver.Recursion;
// 509. [Easy] Fibonacci Number

public class FibonacciNumber {
    public static void main(String[] args) {
        int x = 6;
        System.out.println(fibonacci(x));
    }
    public static int fibonacci(int n){
        //Base case
        if(n <= 1){
            return n;
        }

        int a = fibonacci(n-1);
        int b = fibonacci(n-2);

        return a + b;
    }
}
