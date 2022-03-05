package codechallenges;

import java.util.Locale;

public class AnimalShelter {
    Queue dogQueue = new Queue();
    Queue catQueue = new Queue();

    public void enqueue(String value) {
        value = value.toLowerCase(Locale.ROOT);
        if (value.equals("dog")) {
            dogQueue.enqueue("dog");
        } else if (value.equals("cat")) {
            catQueue.enqueue("cat");
        }
    }

    public String dequeue(String pref) {
        pref = pref.toLowerCase(Locale.ROOT);
        if (pref.equals("cat")) {
            return catQueue.dequeue();
        } else if (pref.equals("dog")) {
            return dogQueue.dequeue();
        }
        return null;
    }
}
