package datastructures.NeetCode.ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
    public static ArrayList<ArrayList<Integer>> threeSum(int[] nums, int targetSum) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int L = i + 1;
            int R = nums.length - 1;
            while (L < R) {
                int currentSum = nums[i] + nums[L] + nums[R];
                if (currentSum == targetSum) {
                    ArrayList<Integer> subArr = new ArrayList<>();
                    subArr.add(nums[i]);
                    subArr.add(nums[L]);
                    subArr.add(nums[R]);
                    result.add(subArr);
                    L += 1;
                    R -= 1;
                } else if (currentSum < targetSum) {
                    L += 1;
                } else {
                    R += 1;
                }
            }
        }
    }
}
