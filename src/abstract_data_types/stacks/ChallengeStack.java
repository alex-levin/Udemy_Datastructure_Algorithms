package abstract_data_types.stacks;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChallengeStack {

    private LinkedList<Character> stack;

    public ChallengeStack() {
        stack = new LinkedList<Character>();
    }

    public void push(Character input) {
        stack.push(input);
    }

    public Character pop() {
        return stack.pop();
    }

    public Character peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Character> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
