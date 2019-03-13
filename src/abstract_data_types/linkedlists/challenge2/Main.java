package abstract_data_types.linkedlists.challenge2;

public class Main {

    public static void main(String[] args) {
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;

        IntegerLinkedList list = new IntegerLinkedList();

        /* My answer
        list.insertSorted(three);
        list.printList();
        System.out.println(list.getSize());

        list.insertSorted(one);
        list.printList();
        System.out.println(list.getSize());

        list.insertSorted(two);
        list.printList();
        System.out.println(list.getSize());

        list.insertSorted(four);
        list.printList();
        System.out.println(list.getSize());
        */


        /* My answer version 2 */
        list.insertSorted2(three);
        list.printList();
        System.out.println(list.getSize());

        list.insertSorted2(one);
        list.printList();
        System.out.println(list.getSize());

        list.insertSorted2(two);
        list.printList();
        System.out.println(list.getSize());

        list.insertSorted2(four);
        list.printList();
        System.out.println(list.getSize());



        /* Answer from the lecture
        list.insertSortedAns(three);
        list.printList();
        list.insertSortedAns(two);
        list.printList();
        list.insertSortedAns(one);
        list.printList();
        list.insertSortedAns(four);
        list.printList();
        */





    }
}
