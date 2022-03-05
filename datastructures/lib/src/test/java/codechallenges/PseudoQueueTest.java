package codechallenges;

import org.junit.jupiter.api.Test;

public class PseudoQueueTest {
    @Test
    public void pseudoQueueEnqueueTest() {
        PseudoQueue sut = new PseudoQueue();
        sut.enqueue(14);
        sut.enqueue(15);
        assert(sut.FIFO.top.value == 14);
    }
    @Test
    public void pseudoQueueDequeueTest() {
        PseudoQueue sut = new PseudoQueue();
        sut.enqueue(14);
        sut.enqueue(15);
        sut.FIFO.pop();
        assert(sut.FIFO.top.value == 15);
    }

}
