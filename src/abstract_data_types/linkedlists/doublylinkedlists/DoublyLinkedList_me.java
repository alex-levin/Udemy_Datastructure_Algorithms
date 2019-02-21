package abstract_data_types.linkedlists.doublylinkedlists;

public class DoublyLinkedList_me {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;


    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (isEmpty()) {
            tail = node;

        } else {
            node.setNext(head);
            head.setPrevious(node);
        }

        head = node;

        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (isEmpty()) {
            head = node;

        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;

    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;

//        if (getSize() == 1) {
        if (head.getNext() == null) {
            tail = null;

        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();

        removedNode.setNext(null);

        size--;

        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;
        if (tail.getPrevious() == null) {
            head = null;

        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        removedNode.setPrevious(null);

        size--;

        return removedNode;
    }



    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD => ");

        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
