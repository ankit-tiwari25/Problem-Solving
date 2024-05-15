package Striver.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// 2215. Find the Difference of Two Arrays
//TODO : Directly copied
public class FindtheDifferenceofTwoArrays {
    public static void main(String[] args) {
        int nums1[] = {1,2,3};
        int nums2[] = {2,4,6};
        
        System.out.println(findDifference(nums1, nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        List<Integer> answer0 = new ArrayList<>();
        List<Integer> answer1 = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();

        nums1Set.forEach(elem -> {
            if (!nums2Set.contains(elem)) {
                answer0.add(elem);
            }
        });
        answer.add(answer0);

        nums2Set.forEach(elem -> {
            if (!nums1Set.contains(elem)) {
                answer1.add(elem);
            }
        });
        answer.add(answer1);

        return answer;
    }
}
