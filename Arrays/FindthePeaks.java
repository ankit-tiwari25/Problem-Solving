package Striver.Arrays;

import java.util.ArrayList;
import java.util.List;

// 2951. [Easy] Find the Peaks
// TODO
public class FindthePeaks {
    public static void main(String[] args) {
        int[] mountain = {1,4,3,8,5};
        List<Integer> list = findPeaks(mountain);
        System.out.println(list);

    }
    public static List<Integer> findPeaks(int[] mount) {
            List<Integer> arr = new ArrayList<>();
        for(int i = 1 ; i <mount.length-1 ;i++){
            if(mount[i] > mount[i-1] && mount[i] > mount[i+1])
            arr.add(i);
        }
        return arr;
    }
}
