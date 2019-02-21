package abstract_data_types.linkedlists.doublylinkedlists;

public class Main_me {

    public static void main(String[] args) {
        Employee janeJonse = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 234);

        DoublyLinkedList_me list_me = new DoublyLinkedList_me();
        list_me.addToEnd(janeJonse);
        list_me.addToEnd(johnDoe);

        list_me.printList();
        System.out.println(list_me.getSize());

        Employee maryHey = new Employee("Mary", "Hey", 345);
        Employee billKnight = new Employee("Bill", "Knight", 345);
        list_me.addToFront(maryHey);
        list_me.addToFront(billKnight);

        list_me.printList();
        System.out.println(list_me.getSize());

        System.out.println(list_me.removeFromFront().toString());
        list_me.printList();
        System.out.println(list_me.getSize());

//        System.out.println(list_me.removeFromFront().toString());
//        list_me.printList();
//        System.out.println(list_me.getSize());
//
//        System.out.println(list_me.removeFromFront().toString());
//        list_me.printList();
//        System.out.println(list_me.getSize());
//
//        System.out.println(list_me.removeFromFront().toString());
//        list_me.printList();
//        System.out.println(list_me.getSize());


        System.out.println(list_me.removeFromEnd());
        list_me.printList();
        System.out.println(list_me.getSize());

        System.out.println(list_me.removeFromEnd());
        list_me.printList();
        System.out.println(list_me.getSize());

        System.out.println(list_me.removeFromEnd());
        list_me.printList();
        System.out.println(list_me.getSize());

    }
}
