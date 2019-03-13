package abstract_data_types.linkedlists.challenge2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;


    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;

        size++;
    }

    public IntegerNode removeFromFront() {
        if (head == null) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();

        removedNode.setNext(null);

        size--;

        return removedNode;
    }

    public void insertSorted(Integer value) {
        IntegerNode node = new IntegerNode(value);

        if (head == null) {
            addToFront(value);
            return;
        }

        IntegerNode current = head;
        IntegerNode previous = null;
        while (current != null) {

            if (node.getValue() < current.getValue()) {
                node.setNext(current);

                if (current == head) {
                    head = node;
                } else {
                    previous.setNext(node);
                }

                size++;
                return;
            }

            previous = current;
            current = current.getNext();
        }

        previous.setNext(node);
        size++;
    }

    public void insertSorted2(Integer value) {
        if (head == null || value < head.getValue()) {
            addToFront(value);
            return;
        }

        IntegerNode node = new IntegerNode(value);

        IntegerNode current = head.getNext();
        IntegerNode previous = head;
        while (current != null) {

            if (value < current.getValue()) {

                node.setNext(current);
                previous.setNext(node);

                size++;
                return;
            }

            previous = current;
            current = current.getNext();
        }

        previous.setNext(node);
        size++;
    }


    public void insertSortedAns(Integer value) {

        // assumption: the list is sorted
        if (head == null || head.getValue() >= value) {
            addToFront(value);
            return;
        }

        // find the insertion point
        IntegerNode current = head.getNext();
        IntegerNode previous = head;
        while (current != null && current.getValue() < value) {
            previous = current;
            current = current.getNext();
        }

        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current);
        previous.setNext(newNode);

        size++;

    }


    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD=>");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
