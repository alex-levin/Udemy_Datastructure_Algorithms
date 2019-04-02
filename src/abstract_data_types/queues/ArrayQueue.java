package abstract_data_types.queues;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (size() == queue.length - 1) {
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];
//            System.arraycopy(queue, 0, newArray, 0, queue.length);
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);

            queue = newArray;

            front = 0;
            back = numItems;
        }

        // <<case-1>>
        // 0 - jane - front
        // 1 - john
        // 2 - mary
        // 3 - mike
        // 4        - back

        // resize

        // 0 - jane - front
        // 1 - john
        // 2 - mary
        // 3 - mike
        // 4 - bill
        // 5        - back
        // 6
        // 7
        // 8
        // 9

        // <<case-2>>
        // 0 - jane - front
        // 1 - john
        // 2        - back
        // 3
        // 4

        // delete jane

        // 0
        // 1 - john - front
        // 2        - back
        // 3
        // 4

        // add jane

        // 0
        // 1 - john - front
        // 2 - jane
        // 3        - back
        // 4

        // delete john

        // 0
        // 1
        // 2 - jane - front
        // 3        - back
        // 4

        // add john

        // 0
        // 1
        // 2 - jane - front
        // 3 - john
        // 4        - back

        // add bill: there's no resize since the size() is less than queue's length, and the back will be point to 0

        // 0        - back
        // 1
        // 2 - jane - front
        // 3 - john
        // 4 - bill

        queue[back] = employee;
        if (back < queue.length - 1) { // <<case-1>>
            back++;

        } else { // <<case-2>>
            back = 0;
        }
    }

    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;


        // 0 - jane
        // 1 - john
        // 2         - back
        // 3 - mike  - front
        // 4 - bill

        // delete mike

        // 0 - jane
        // 1 - john
        // 2         - back
        // 3
        // 4 - bill  - front

        // delete bill

        // 0 - jane
        // 1 - john
        // 2         - back
        // 3
        // 4
        // 5  - front : at this point front should be 0

        // 0 - jane  - front
        // 1 - john
        // 2         - back
        // 3
        // 4
        } else if (front == queue.length) {
            front = 0;
        }

        return employee;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {
        if (front <= back) {
            return back - front;

        } else {
            // back - front will be negative number, so need to plus queue.length
            return back - front + queue.length;
        }

    }

    public void printQueue() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }

        } else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }

            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }

    }



}
