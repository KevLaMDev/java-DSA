package codechallenges.hashmap;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap<K, V>
{
    ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;
    public int size;

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


    public void set(K key, V value) {
        // hash key to get index
        int index = hash(key);
        // instantiate new HashMapPair object passing in key and value args
        HashMapPair<K, V> hashMapPair = new HashMapPair<>(key, value);
        // get linkedList at specified index of hashmap
        LinkedList<HashMapPair<K, V>> linkedListAtIndex = bucketArrayList.get(index);
        // add the new HashMapPair object to the linkedList
            for (HashMapPair<K, V> el : linkedListAtIndex) {
                if (el.getKey().equals(key)) {
                    el.setValue(value);
                    return;
                }
            }
            linkedListAtIndex.addFirst(hashMapPair);
        }


    public V get(K key) {
        // get index via hashing key
        int index = hash(key);
        // get linked list in hashmap via index
        LinkedList<HashMapPair<K, V>> linkedListAtIndex = bucketArrayList.get(index);
        // iterate over linked list at index in hashmap
        for (HashMapPair<K, V> hashMapPair : linkedListAtIndex) {
            // check if hashmap pair key equals input key
                // if so return out hashmap pair object
            if (hashMapPair.getKey().equals(key)) return hashMapPair.getValue();
        }
        return null;
    }

    public boolean contains(K key) {
        int index = hash(key);
        LinkedList<HashMapPair<K, V>> linkedListAtIndex = bucketArrayList.get(index);
        for (HashMapPair<K, V> hashMapPair : linkedListAtIndex) {
            if (hashMapPair.getKey().equals(key)) return true;
        }
        return false;
    }

    public List<K> keys() {
        List<K> listOfKeys = new ArrayList<>();
        for (LinkedList<HashMapPair<K, V>> linkedList : bucketArrayList) {
            for (HashMapPair<K, V> hashMapPair : linkedList) {
                listOfKeys.add(hashMapPair.getKey());
            }
        }
        return listOfKeys;
    }

    public List<HashMapPair<K, V>> entries() {
        List<HashMapPair<K, V>> entriesList= new ArrayList<>();
        for (LinkedList<HashMapPair<K, V>> linkedList : bucketArrayList) {
            for (HashMapPair<K, V> hashMapPair : linkedList) {
                entriesList.add(hashMapPair);
            }
        }
        return entriesList;
    }

    public int hash(K key) {
        return Math.abs(key.hashCode()) % size;
    }



}
