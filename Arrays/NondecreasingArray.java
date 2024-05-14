package Striver.Arrays;
// 665[Medium]. Non-decreasing Array
// TODO : (Directly Copied)
public class NondecreasingArray {
    public static void main(String[] args) {
        int[] nums = {4,2,3};
        System.out.println(nondecreasingArray(nums));

    }
    public static boolean nondecreasingArray(int[] N){
        for (int i = 1, err = 0; i < N.length; i++)
        if (N[i] < N[i-1])
            if (err++ > 0 || (i > 1 && i < N.length - 1 && N[i-2] > N[i] && N[i+1] < N[i-1]))
                return false;
    return true;
    }
}
