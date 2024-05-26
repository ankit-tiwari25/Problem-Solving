package Striver.BinarySearch;
// 367. [Easy] Valid Perfect Square
// TODO
public class ValidPerfectSquare {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPerfectSquare(n));
    }
    public static boolean isPerfectSquare(int num) {
        long l = 1, r = num;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (mid * mid == num) 
                return true;
            else if (mid * mid > num) 
                r = mid - 1; 
            else 
                l = mid + 1;
        }
        return false;
    }
}
