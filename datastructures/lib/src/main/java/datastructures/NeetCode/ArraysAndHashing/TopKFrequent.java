package datastructures.NeetCode.ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class TopKFrequent {
    public TopKFrequent() {
    }

    public ArrayList getTopKFrequentEls(int k, int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                Integer keyValue = hm.get(nums[i]);
                keyValue += 1;
                hm.put(nums[i], keyValue);
            } else {
                hm.put(nums[i], 1);
            }
        }
        ArrayList<ArrayList> arrlist = new ArrayList<>();
        Set keySet = hm.keySet();
        for (Object key : keySet) {
            ArrayList<Integer> subArr = new ArrayList<>();
            Integer keyNum = (Integer) key;
            subArr.add(0, keyNum);
            subArr.add(1, hm.get(key));
            arrlist.add(subArr);
        }
        System.out.println(arrlist);
        return arrlist;
    }

    //input: int k, arr of nums
    //output: arr of k most common els in arr of nums
        // use a hashmap to store the els of the arr
        // iterate over arr via for loop
            // if el exists in hashmap, increment value
            // else put el in hashmap with value of 1
        // populate 2D array with entries of hm
            // iterate over keys of hm
                // for each key:
                    // make subarr at index
                    // populate subarr: index of 0 = key, index of 1 = value;
        // iterate over 2D arr
            // sort 2D arr by val of index 1
        // iterate backwards over 2D, for K loops
            // push index of 1 subarr into new arr
        // return new arr

}
