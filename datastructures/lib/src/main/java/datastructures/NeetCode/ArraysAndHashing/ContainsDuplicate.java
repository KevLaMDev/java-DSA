package datastructures.NeetCode.ArraysAndHashing;

import java.util.HashMap;

public class ContainsDuplicate {

    public ContainsDuplicate() {

    }

    public boolean containsDuplicate(int[] arr) {
        if (arr.length == 0) return false;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) return true;
            else hm.put(arr[i], 1);
        }
        return false;
    }

    // if given arr contains dups, return true or false
    // input: arr of ints
    // output: boolean value
        // if arr of is empty return true
        // initialize hashmap
        // for loop to iterate over arr
            // check if current index exists in the hashmap: if so, return true
            // else put current index in hm
        // return false: at no point during the for loop we returned true;
}
