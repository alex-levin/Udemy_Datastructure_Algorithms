package abstract_data_types.queues;

import java.util.Iterator;
import java.util.LinkedList;

public class ChallengeQueue {

    private LinkedList<Character> queue;

    public ChallengeQueue() {
        this.queue = new LinkedList<>();
    }

    public void add(Character chr) {
        this.queue.add(chr);
    }

    public Character remove() {
        return this.queue.remove();
    }

    public int getSize() {
        return this.queue.size();
    }

    public void printQueue() {
        for (Character aQueue : queue) {
            System.out.println(aQueue);
        }
    }

    public Iterator iterateQueue() {
        return queue.listIterator();
    }
}
