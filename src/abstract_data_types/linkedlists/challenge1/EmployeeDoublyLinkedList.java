package abstract_data_types.linkedlists.challenge1;

public class EmployeeDoublyLinkedList {

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

    // My Answer
    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        // return true if you were able to successfully add the employee
        // into the list before the existing employee. Return false
        // if the existing employee doesn't exist in the list

        // add your code here
        EmployeeNode current = head;
        while (current != null) {
            if (current.getEmployee().equals(existingEmployee)) {

                EmployeeNode newNode = new EmployeeNode(newEmployee);

//                if (current.getPrevious() == null) {//head
                if (current == head) {//head
                    head = newNode;

                } else {
                    newNode.setPrevious(current.getPrevious());
                    current.getPrevious().setNext(newNode);
                }

                newNode.setNext(current);
                current.setPrevious(newNode);

                size++;
                return true;
            }

            current = current.next;
        }

        return false;
    }


    // Answer from the video
    public boolean addBeforeAns(Employee newEmployee, Employee existingEmployee) {
        // return true if you were able to successfully add the employee
        // into the list before the existing employee. Return false
        // if the existing employee doesn't exist in the list

        // add your code here
        if (head == null) {
            return false;
        }

        // find the existing employee
        EmployeeNode current = head;
        while (current != null && !current.getEmployee().equals(existingEmployee)) {
            current = current.getNext();
        }

        if (current == null) {
            return false;
        }

        EmployeeNode newNode = new EmployeeNode(newEmployee);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);

        if (head == current) {
            head = newNode;

        } else {
            newNode.getPrevious().setNext(newNode);
        }

        size ++;

        return true;
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

        if (size == 1) {
            head = null;
            tail = null;

        } else {
            head.getNext().setPrevious(null);
            head = head.getNext();
        }

        removedNode.setNext(null);

        size--;

        return removedNode;

    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if (size == 1) {
            head = null;
            tail = null;

        } else {
            tail.getPrevious().setNext(null);
            tail = tail.getPrevious();
        }

        removedNode.setPrevious(null);
        size--;
        return removedNode;

    }


    public int getSize() {
        return size;
    }


    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD=>");
        while (current != null) {
            System.out.print(current);
            System.out.print("<=>");
            current = current.getNext();
        }
        System.out.println("<=TAIL");
    }



}
