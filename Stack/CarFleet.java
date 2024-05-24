package Striver.Stack;

import java.util.Arrays;

// 853. [Medium] Car Fleet
public class CarFleet {
    public static void main(String[] args) {
        int position[] = {10,8,0,5,3};
        int speed[] = {2,4,1,1,3};
        int target = 12;
        System.out.println("Position");
        display(position);
        System.out.println("Speed");
        display(speed);
        System.out.println("Answer");
        System.out.println(carFleet(target, position, speed));



    }
     public static int carFleet(int target, int[] pos, int[] speed) {
           int N = pos.length, res = 0;
        double[][] cars = new double[N][2];
        for (int i = 0; i < N; ++i)
            cars[i] = new double[] {pos[i], (double)(target - pos[i]) / speed[i]};
        Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));
        double cur = 0;
        for (int i = N - 1; i >= 0 ; --i) {
            if (cars[i][1] > cur) {
                cur = cars[i][1];
                res++;
            }
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
