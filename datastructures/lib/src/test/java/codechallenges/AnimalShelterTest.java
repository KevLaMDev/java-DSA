package codechallenges;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;

public class AnimalShelterTest {
    @Test
    void AnimalShelterEnqueueTest() {
        AnimalShelter sut = new AnimalShelter();
        sut.enqueue("cat");
        sut.enqueue("dog");
        assert(sut.catQueue.front.value == "cat" && sut.dogQueue.front.value == "dog");
    }
    @Test
    void AnimalShelterDequeueTest() {
        AnimalShelter sut = new AnimalShelter();
        sut.enqueue("cat");
        sut.enqueue("dog");
        sut.dequeue("cat");
        sut.dequeue("dog");
        assert(sut.catQueue.front == null && sut.dogQueue.front == null);
    }

}
