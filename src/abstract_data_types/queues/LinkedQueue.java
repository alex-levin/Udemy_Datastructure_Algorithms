package abstract_data_types.queues;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedQueue {

    private LinkedList<Employee> queue;

    public LinkedQueue() {
        this.queue = new LinkedList<Employee>();
    }

    public void add(Employee employee) {
        this.queue.add(employee);
    }

    public Employee remove() {
        return this.queue.remove();
    }

    public Employee peek() {
        return this.queue.peek();
    }

    public int size() {
        return this.queue.size();
    }

    public void printQueue() {
        Iterator<Employee> itr = this.queue.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
