package abstract_data_types.linkedlists.challenge1;


public class Main {

    public static void main(String[] args) {

        Employee maryJane = new Employee("Mary", "Jane", 123);
        Employee johnSmith = new Employee("John", "Smith", 234);
        Employee elderFlower = new Employee("Elder", "Flower", 345);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(maryJane);
        list.addToFront(johnSmith);
        list.addToFront(elderFlower);

        list.printList();

        Employee mikeWilson = new Employee("Mike", "Wilson", 678);
        Employee billEnd = new Employee("Bill", "End", 789);

        list.addToEnd(mikeWilson);
        list.addToEnd(billEnd);

        list.printList();

        list.removeFromFront();
        list.printList();

//        list.removeFromFront();
//        list.printList();
//
//        list.removeFromFront();
//        list.printList();
//
//        list.removeFromFront();
//        list.printList();
//
//        list.removeFromFront();
//        list.printList();

        list.removeFromEnd();
        list.printList();

        list.removeFromEnd();
        list.printList();

        Employee sunkyungChoi = new Employee("Sunkyung", "Choi", 7812);


        /* My Answer */
        System.out.println(list.addBefore(sunkyungChoi, maryJane));
        list.printList();

        System.out.println(list.addBefore(billEnd, sunkyungChoi));
        list.printList();

//        list.removeFromFront();
//        list.removeFromFront();
//        list.removeFromFront();
//        list.removeFromFront();

        System.out.println(list.addBefore(billEnd, sunkyungChoi));
        list.printList();

        System.out.println(list.addBefore(new Employee("Someone", "Else", 000), johnSmith));
        list.printList();

        /* Answer From the lecture
        System.out.println(list.addBeforeAns(sunkyungChoi, maryJane));
        list.printList();

        System.out.println(list.addBeforeAns(billEnd, sunkyungChoi));
        list.printList();

        list.removeFromFront();
        list.removeFromFront();
        list.removeFromFront();
        list.removeFromFront();

        System.out.println(list.addBeforeAns(billEnd, sunkyungChoi));
        list.printList();
        */


    }
}
