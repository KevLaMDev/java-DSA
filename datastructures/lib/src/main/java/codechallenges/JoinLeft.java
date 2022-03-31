package codechallenges;

import datastructures.hashmap.HashMap;
import datastructures.hashmap.HashMapPair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JoinLeft {

    public List<HashMapPair<String, ArrayList<String>>> joinLeft(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
        if (hashmap1.keys() == null) return null;
        HashMap<String, ArrayList<String>> hashmap3 = new HashMap<>(hashmap1.size);
        List<String> keysOfHashMap1 = hashmap1.keys();
        for (String key : keysOfHashMap1) {
            String valueOfHashmap1 = hashmap1.get(key);
            ArrayList<String> arrayListOfStrings = new ArrayList<>();
            arrayListOfStrings.add(valueOfHashmap1);
            if (hashmap2.contains(key)) {
                arrayListOfStrings.add(hashmap2.get(key));
            }
            hashmap3.set(key, arrayListOfStrings);
        }
        return hashmap3.entries();
    }
}
