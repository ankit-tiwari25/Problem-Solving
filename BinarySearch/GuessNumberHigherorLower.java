package Striver.BinarySearch;
//374[Easy]. Guess Number Higher or Lower
public class GuessNumberHigherorLower {
    public static void main(String[] args) {
        System.out.println(guessNumberHigherorLower(10));
    }
    public static int guessNumberHigherorLower(int n){
        int i = 1;
        int j = n;

        while(i<=j){
            int mid = i + (j-i)/2;

            int res = guess(mid,n);
            if( res == 0) return mid;
            if( res == 1) i = mid + 1;
            else j = mid-1;
        }
        return -1;
    }
    public static int guess(int mid, int n){
        if( (n/2) == mid){
            return 0;
        }
        return -1;
    }

}
