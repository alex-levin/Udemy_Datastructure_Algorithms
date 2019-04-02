package abstract_data_types.queues;

public class LinkedQueueMain {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedQueue queue = new LinkedQueue();

        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);

        queue.printQueue();
        System.out.println(queue.size());
        System.out.println("=================================================");

        queue.remove();
        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue.size());
        queue.printQueue();

        System.out.println("=================================================");

        queue.remove();
        queue.printQueue();

        System.out.println("=================================================");

        queue.add(mikeWilson);
        queue.add(billEnd);
        queue.printQueue();




    }
}
