package datastructures.NeetCode.ArraysAndHashing;

import java.util.HashMap;

public class TwoSum {

    public TwoSum() {
    }

    public int[] twoSumIndicies(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer complement = target - nums[i];
            if (hm.containsKey(complement)) {
                arr[0] = i;
                arr[1] = hm.get(complement);
                return arr;
            } else {
                hm.put(nums[i], i);
            }
        }
        return arr;
    }

    // write a func that returns the two indicies of the els in an arr that add up to a given target
    // input: arr of nums, target int
    // output: arr of two indicies

    // appraoch 1:
        // nested for loops: for each el of arr, check every other el to look for its complement
        // time complexity: O(n)^2
    // approach 2:
        // binary search: sort the arr of nums, using left and right pointers adjust window accordingly
        // time complexity: O(n log n)
    // approach 3:
        // hashmap: check if current el's complement exists in the hashmap, if not put current el and respective index into hashmap
        // time complexity: O(n)

        // initialize new hashmap
        // declare new arr of 2 length
        // iterate over the arr of nums
            // check if current num's complement exists in the hashmap
                // if so, put index of current num and complement into arr, return arr
            // else store current num and index in hashmap
}
