package datastructures.hashmap;

import datastructures.hashmap.HashMap;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HashmapTest {

    @Test
    void hashMapTestSize() {
        HashMap<String, String> hashMap = new HashMap<>(17);
        assert(hashMap.size == 17);
    }
    @Test
    void hashKeyTest() {
        HashMap<String, String> hashMap = new HashMap<>(17);
        System.out.println(hashMap.hash("hi"));
        assert(hashMap.hash("hi") == 14);
    }
    @Test
    void hashMapAddTest() {
        HashMap<String, String> hashMap = new HashMap<>(17);
        hashMap.set("new key", "new value");
        assert(hashMap.contains("new key"));
    }
    @Test
    void hashMapGetTest() {
        HashMap<String, String> hashMap = new HashMap<>(17);
        hashMap.set("new key", "new value");
        assert(hashMap.get("new key").equals("new value"));
    }
    @Test
    void hashMapContains() {
        HashMap<String, String> hashMap = new HashMap<>(17);
        hashMap.set("Greeting", "Hello World!");
        assert(hashMap.contains("Greeting"));
    }
    @Test
    void hashMapList() {
        HashMap<String, String> hashMap = new HashMap<>(17);
        hashMap.set("Greeting", "Hello World!");
        hashMap.set("Farewell", "Goodbye World!");
        List<String> testArr = new ArrayList<>();
        testArr.add("Greeting");
        testArr.add("Farewell");
        assert(hashMap.keys().equals(testArr));
    }
    @Test
    void hashMapSetMultiple() {
        HashMap<String, String> hashMap = new HashMap<>(17);
        hashMap.set("Greeting", "Hello World!");
        hashMap.set("Farewell", "Goodbye World!");
        hashMap.set("GreetingITA", "Buongiorno!");
        hashMap.set("GreetingFR", "Bonjour!");
        assert(hashMap.keys().size() == 4);
    }
    @Test
    void hashMapGetfromMultiple() {
        HashMap<String, String> hashMap = new HashMap<>(17);
        hashMap.set("Greeting", "Hello World!");
        hashMap.set("Farewell", "Goodbye World!");
        hashMap.set("GreetingITA", "Buongiorno!");
        hashMap.set("GreetingFR", "Bonjour!");
        assert(hashMap.get("GreetingITA").equals("Buongiorno!"));
    }
    @Test
    void hashMapContainsMultiple() {
        HashMap<String, String> hashMap = new HashMap<>(17);
        hashMap.set("Greeting", "Hello World!");
        hashMap.set("Farewell", "Goodbye World!");
        hashMap.set("GreetingITA", "Buongiorno!");
        hashMap.set("GreetingFR", "Bonjour!");
        assert(hashMap.contains("Greeting") && hashMap.contains("GreetingFR"));
    }
    @Test
    void hashMapOverwriteValue() {
        HashMap<String, String> hashMap = new HashMap<>(17);
        hashMap.set("Greeting", "old greeting");
        hashMap.set("Greeting", "new greeting");
    }
}
