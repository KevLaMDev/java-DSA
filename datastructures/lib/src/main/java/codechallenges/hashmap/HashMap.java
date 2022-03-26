package codechallenges.hashmap;


import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K, V>
{
    ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;
    int size;

    public HashMap(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("HashMap size must be >= 1");
        }

        this.size = size;
        this.bucketArrayList = new ArrayList<>();

        for (int i = 0; i < this.size; i++) {
            bucketArrayList.add(i, new LinkedList<>());
        }
    }

    public void add(K key, V value) {
        if (bucketArrayList.contains(key)) {

        }
    }
}
