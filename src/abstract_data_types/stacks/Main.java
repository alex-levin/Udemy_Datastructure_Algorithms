package abstract_data_types.stacks;

public class Main {

    public static void main(String[] args) {

        /* Array Stack

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

//        stack.printStack();

//        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println();

        stack.printStack();
        System.out.println();

        System.out.println(stack.peek());
        */


        /* Linked Stack */
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack stack = new LinkedStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);

        stack.printStack();

        System.out.println("=============================================");

        System.out.println(stack.peek());
        System.out.println("=============================================");
        stack.printStack();








    }
}
