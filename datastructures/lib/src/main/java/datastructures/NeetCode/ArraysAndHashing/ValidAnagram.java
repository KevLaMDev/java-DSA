package datastructures.NeetCode.ArraysAndHashing;

import java.util.HashMap;

public class ValidAnagram {

    public ValidAnagram() {
    }

    public boolean checkIfValidAnagram(String word1, String word2) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char currChar : word1.toCharArray()) {
            if (hm.containsKey(currChar)) {
                Integer keyValue = hm.get(currChar);
                keyValue += 1;
                hm.put(currChar, keyValue);
            } else {
                hm.put(currChar, 1);
            }
        }
        for (char currChar : word2.toCharArray()) {
            if (hm.containsKey(currChar)) {
                Integer keyValue = hm.get(currChar);
                keyValue -= 1;
                hm.put(currChar, keyValue);
            } else {
                return false;
            }
        }
        for (Integer keyValue : hm.values()) {
            if (keyValue > 0) return false;
        }
        return true;
    }
    // input 2 strings
    // output boolean val: if string1 is anagram of string2
        // initialize hashmap to store chars of words
        // iterate over string1 chars via for loop
            // check if current char exists in hashmap
                // if so, increment the respective value in hashmap
            // else does not exist: put in hashmap with value of 1
        // iterate over string2 chars via for loop
            // check if string2 char exists in hashmap
                // if so, decrement respective value
            // else return false
        // check values of hashmap; if no value is greater than 0 return true, else return false;

}
