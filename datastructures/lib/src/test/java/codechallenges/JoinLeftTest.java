package codechallenges;

import datastructures.hashmap.HashMap;
import datastructures.hashmap.HashMapPair;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;

public class JoinLeftTest {
    @Test
    void joinLeftTest() {
        JoinLeft sut = new JoinLeft();
        HashMap<String, String> hashMap1 = new HashMap<>(10);
        hashMap1.set("diligent", "employed");
        hashMap1.set("fond", "enamored");
        hashMap1.set("guide", "usher");
        hashMap1.set("outfit", "garb");
        hashMap1.set("wrath", "anger");
        HashMap<String, String> hashMap2 = new HashMap<>(10);
        hashMap2.set("diligent", "idle");
        hashMap2.set("fond", "averse");
        hashMap2.set("guide", "follow");
        hashMap2.set("flow", "jam");
        hashMap2.set("wrath", "delight");
        System.out.println(sut.joinLeft(hashMap1, hashMap2));
    }
}
